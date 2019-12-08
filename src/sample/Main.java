package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import services.Chrono;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
        primaryStage.setTitle("Time Tracker");
        primaryStage.setScene(new Scene(root, 406  , 712));
        primaryStage.setResizable(false);
        primaryStage.show();
        Image icon = new Image("view/assests/logo.png");
        primaryStage.getIcons().add(icon);


        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println(date.format(formatter));

    }


    public static void main(String[] args) {
        launch(args);
    }



}
