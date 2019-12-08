package services;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class TaskService {
    //http://sales.crm.192.168.66.160.xip.io    odoodb
   public final String url = "http://sales.crm.192.168.66.160.xip.io", db = "odoo";
   // public final String url = "https://testtest3.odoo.com", db = "testtest3";
    public  Object[] getTasks(int uid, String password ,String project) {
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
                            "project.task",
                            "search_read",asList(
                                    asList(asList("project_id" , "=",project))
                            )
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
