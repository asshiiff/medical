package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class invigilatorDashboardController
{
    @javafx.fxml.FXML
    private Label dashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void candidateListButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/searchCandidates.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) dashboardLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void attendanceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportIncidentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monitorExamStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyCandidateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkSeatingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void faqButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void examStatisticsButton(ActionEvent actionEvent) {
    }
}