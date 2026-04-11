package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDashboardController {
    @javafx.fxml.FXML
    private Label studentDashboardLabel;

    @javafx.fxml.FXML
    public void startExamButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/selectAndStartExam.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewExamScheduleButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/viewExamSchedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updateProfileButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/updateProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void ViewExamResultsButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/viewExamResults.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void feedbackButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/feedback.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void paymentHistoryButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/paymentHistory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void requestReEvaluationButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/requestReEvaluation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void contactTeacherButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/contactTeacher.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) studentDashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
