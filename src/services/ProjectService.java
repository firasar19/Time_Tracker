package services;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class ProjectService {

    //sales.crm.192.168.66.160.xip.io   odoodb
    public final String url = "http://sales.crm.192.168.66.160.xip.io", db = "odoo";
   // public final String url = "https://testtest3.odoo.com", db = "testtest3";

    public Object[] getProjects(Integer uid, String password) {
        final XmlRpcClient models = new XmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                try {
                    setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }});
        }};

        Object[] list = new Object[0];
        try {
            list = (Object[]) models.execute("execute_kw",
                    asList(
                            db,
                            uid,
                            password,
                            "project.project",
                            "search_read"
                            , new HashMap())

            );
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }


        /**   for (Object obj : list) {
         HashMap<String, Object> record = (HashMap<String, Object>) obj;
         System.out.println(record.get("name"));

         }  **/
        return list;
    }


}