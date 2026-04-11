package com.spring26.section2.group11.medical;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginPageController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private PasswordField passwordField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("invigilator") && password.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/invigilatorDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) usernameField.getScene().getWindow();

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

        if (username.equals("authority") && password.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) usernameField.getScene().getWindow();

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

        if (username.equals("examcontroller") && password.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) usernameField.getScene().getWindow();

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }


        if (username.equals("questionsetter") && password.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/questionSetterDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) usernameField.getScene().getWindow();

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }
    }
}