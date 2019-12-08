package controllers;

import com.jfoenix.controls.JFXSpinner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClientException;
import org.controlsfx.control.Notifications;
import services.LoginService;

import java.io.IOException;

public class LoginController {
    public void setUser(TextField user) {
        this.user = user;
    }

    public void setMp(PasswordField mp) {
        this.mp = mp;
    }

    @FXML
    private TextField user;

    public TextField getUser() {
        return user;
    }

    public PasswordField getMp() {
        return mp;
    }

    @FXML
    private PasswordField mp;

    @FXML
    private Button login;

    @FXML
    private Label lab;




    public void login(ActionEvent event) throws XmlRpcClientException, XmlRpcException, IOException {


        boolean serviceLogin = new LoginService().connection(user.getText(), mp.getText());


        if (serviceLogin) {

            Parent root = FXMLLoader.load(getClass().getResource("../view/mainvue.fxml"));

            Scene scene = new Scene(root);
            Stage primaryStage = (Stage) login.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.show();

        } else {

            Image image = new Image("view/assests/highlight_off_black_72x72.png");
            Notifications notif = Notifications.create()
                    .title("")
                    .text("Unable to login.Please check your id and password ")
                    .graphic(new ImageView(image))
                    .hideAfter(Duration.seconds(5))
                    .position(Pos.TOP_CENTER)
                    .onAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                        }
                    });
            notif.darkStyle();
            notif.show();



        }


    }


}

