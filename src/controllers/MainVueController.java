package controllers;

import com.jfoenix.controls.JFXToggleButton;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apache.xmlrpc.XmlRpcException;
import services.*;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class MainVueController {
    @FXML
    private Label taskdescription;
    @FXML
    private Label day;
    @FXML
    private Label time;

    @FXML
    private ComboBox project;

    @FXML
    private  ComboBox task;

    @FXML

    private ImageView imv;

    @FXML
    private JFXToggleButton tb;

    public String ctask,cproject;

    private int idproject ,idtask;

    private int keyboardNb = 0;
    private int mouseNb=0;
  //  private String workingOn=(cproject+":"+ctask);

    @FXML

    public Claims credt (){

        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(LoginService.SECRET_KEY))
                .parseClaimsJws(LoginService.Token).getBody();


        return claims;
    }



    public void initialize(){

        Integer ID = (Integer) credt().get("ID");
        String password = credt().get("password").toString();

        ProjectService projectService= new ProjectService();
        projectService.getProjects(ID,password);
        for (Object obj : projectService.getProjects(ID,password)) {
            HashMap<String, Object> record = (HashMap<String, Object>) obj;
           // String projectp = record.get("name").toString();
           String projectp =(record.get("name").toString()+","+record.get("id").toString());
            project.getItems().add(projectp);
            System.out.println(record.get("name"));





        }


        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        DayOfWeek today = DayOfWeek.from(LocalDate.now());
        day.setText(String.valueOf(today));


    }


@FXML
public void action_snapshot() throws IOException, XmlRpcException, InterruptedException {
    Integer ID = (Integer) credt().get("ID");
    String password = credt().get("password").toString();


  /*  ActivityService as= new ActivityService();
    as.setCp(cproject);
    as.setCt(ctask);
*/


    Snapshot snapshot = new Snapshot().takeSnapshots();

    String time = snapshot.getSnapshotTs().toString();
    BufferedImage image = snapshot.getBufferedImage();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(image, "jpg", baos);
    baos.flush();
    byte[] imageInByte = baos.toByteArray();
    baos.close();
    taskdescription.setText(cproject + ":" + ctask);
   TimesheetService timesheet = new TimesheetService();
    timesheet.setTimesheet(ID,password ,idproject,idtask);



ActService test = new ActService();
test.execute();



    if (tb.isDisable())
    {

test.isInterrupted();

    }



    //-------------------------------------------------------------------------------------------------------
}






    //  taskdescription.setText(cproject+":"+ctask);




@FXML
public void aaaaaaa(){

    System.out.println(task.getValue());
    ctask= (String) task.getValue();
    String[] gettaskid = ctask.split(",");
    System.out.println(gettaskid[1]);
    String convertidtask = gettaskid[1];
    idtask= Integer.parseInt(convertidtask);


    cproject=(String) project.getValue();
    String[] getprojectid=cproject.split(",");


    System.out.println(getprojectid[0]);
    String convertidproject = getprojectid[1];

    idproject = Integer.parseInt(convertidproject);



}






    @FXML
    public String chooseProject (){
        task.getItems().clear();




        String prj = (String) project.getValue();


        String[] prjn = prj.split(",");
        Integer ID = (Integer) credt().get("ID");
        String password = credt().get("password").toString();
        TaskService taskService = new TaskService();

        taskService.getTasks(ID,password,prj);
        System.out.println(ID+password);

        for (Object obj : taskService.getTasks(ID,password,prjn[0])) {
            HashMap<String, Object> record = (HashMap<String, Object>) obj;
          //  String taskP = record.get("name").toString();
            String taskP =( record.get("name").toString()+","+record.get("id").toString());

            task.getItems().add(taskP);
            System.out.println(record.get("name"));
            System.out.println(record.get("id"));

        }

        System.out.println(prj);
        return prj;
    }


    public void setTask(ActionEvent event){

    taskdescription.setText("hatta chay");

    //Image image = getImage();
    Image snap = null;
    //Image image = new Image("view/assests/Products_NoImageYet.jpg");
  // snapshot.setImage(image);
}


}
