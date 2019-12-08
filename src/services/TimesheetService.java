package services;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class TimesheetService {


    public final String url = "http://sales.crm.192.168.66.160.xip.io", db = "odoo";
    public void setTimesheet(Integer uid,String password ,int project_name,int task_name ) throws XmlRpcException {



        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dtoday = date.format(formatter);
        System.out.println(date.format(formatter));

        final XmlRpcClient models = new XmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                try {
                    setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }});
        }};



        final Integer id2 = (Integer) models.execute("execute_kw", asList(
                db, uid, password,





       /* "x_feuille_de_temps", "create",*/
                "time_sheet","create",
                    asList(new HashMap() {{
                    /*put("x_studio_date", "05/14/2019");*/
                    put("date", dtoday);
                    put("employee_id", uid);
                    put("name", project_name+":"+task_name);
                    put("project_id", project_name);
                    put("task_id", task_name);
                    put("unit_amount", 10);

                }})
        ));


    }


}
