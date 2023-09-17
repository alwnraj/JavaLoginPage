package com.example.javaproject1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable{

    @FXML
    private Button button_signup;

    @FXML
    private Button button_log_in;

    @FXML
    private TextField txtfld_username;

    @FXML
    private TextField txtfld_password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if (txtfld_username.getText().isEmpty() && !txtfld_password.getText().trim().isEmpty()) {
                        DbUtilis.signUpUser(event, txtfld_username.getText(), txtfld_password.getText());
                    }
                }
        });

        button_log_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbUtilis.changeScene(event, "loginpage.fxml", "Log in!", null);
            }
        });
    }
}
