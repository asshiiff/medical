package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class ExamControllerDashboardController
{
    @javafx.fxml.FXML
    private Label examControllerDashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {

        examControllerDashboardLabel.setText("Welcome to Exam Controller Dashboard");

        String username = "Exam Controller";
        examControllerDashboardLabel.setText("Welcome, " + username);


    }

    @javafx.fxml.FXML
    public void cancelResheduleExamButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/cancelResheduleExam.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void publishExamScheduleButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/publishExamSchedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void monitorExamStatusButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/monitorExamStatus.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void generateReportsButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/generateReports.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void dateAndTimeForExamButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/dateAndTime.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updateExamScheduleButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/updateExamSchedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    @javafx.fxml.FXML
    public void centerForExamButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/centerForExam.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void assignInvigilatorsButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/assignInvigilators.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/spring26/section2/group11/medical/loginPage.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) examControllerDashboardLabel.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();


    }
}