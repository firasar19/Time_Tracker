package controllers;
// jwt

import javax.xml.bind.DatatypeConverter;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
//---------------
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import services.LoginService;
import services.ProjectService;
import services.TaskService;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChoiceController {

    @FXML
    private ComboBox project;

    @FXML
    private  ComboBox task;

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
            String projectp = record.get("name").toString();
            int projectId = (int) record.get("id");

            project.getItems().add(projectp);
            System.out.println(record.get("name"));





}





}

    @FXML
    public String chooseProject (){
    task.getItems().clear();
  String prj = (String) project.getValue();
        Integer ID = (Integer) credt().get("ID");
        String password = credt().get("password").toString();
        TaskService taskService = new TaskService();

        taskService.getTasks(ID,password,prj);
        System.out.println(ID+password);

        for (Object obj : taskService.getTasks(ID,password,prj)) {
            HashMap<String, Object> record = (HashMap<String, Object>) obj;
            String taskP = record.get("name").toString();
            task.getItems().add(taskP);
            System.out.println(record.get("name"));

        }

        System.out.println(prj);
        return prj;
    }


    /*@FXML
    public void next (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/mainvue.fxml"));

       Scene scene = new Scene(root);
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.show();
    }
*/
}


