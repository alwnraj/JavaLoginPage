package com.example.javaproject1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button button_login;

    @FXML
    private TextField txtfld_username;

    @FXML
    private TextField txtfld_password;

    @FXML
    private Button button_signup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbUtilis.logInUser(event, txtfld_username.getText(), txtfld_password.getText());
            }
        });

        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbUtilis.changeScene(event, "signup.fxml","Sign up!", null );
            }
        });

    }
}