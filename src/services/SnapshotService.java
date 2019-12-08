package services;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class SnapshotService {




    public final String url = "http://sales.crm.192.168.66.160.xip.io", db = "odoo";


    public void SendSnapshot( byte[] imageInByte , String time ,Integer uid, String password,int keyboard_clicks , int mouse_clicks ,String project_name,String task_name) throws XmlRpcException {



        final XmlRpcClient models = new XmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                try {
                    setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }});
        }};


        final Integer id = (Integer) models.execute("execute_kw", asList(
                db, uid, password,

                "x_workdiary", "create",
                asList(new HashMap() {{
                    put("name", project_name+":"+task_name);
                    put("user_name", "20");
                    put("taken_on", time);
                    put("keyboard_activity_",keyboard_clicks);
                    put("mouse_activity_",mouse_clicks);
                    put("snapshot", Base64.getEncoder().encodeToString(imageInByte));
                    /* put("x_name", project_name+":"+task_name);*/
                    /*  put("x_studio_field_X8f4A", "20");*/
                    // put("x_studio_field_f750P", time);
                    // put("x_studio_mouse_activity",mouse_clicks);
                    // put("x_studio_keyboard_activity_",keyboard_clicks);
                    //put("x_studio_field_D3U0M", Base64.getEncoder().encodeToString(imageInByte));
                }})
        ));



    }
}
