package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectAndStartExamController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private ComboBox<String> examSubjectCB;
    @javafx.fxml.FXML
    private Label exam4Label;
    @javafx.fxml.FXML
    private Label exam1Label;
    @javafx.fxml.FXML
    private Label exam2Label;
    @javafx.fxml.FXML
    private Label examinstructionsLabel;
    @javafx.fxml.FXML
    private Label exam3Label;

    @javafx.fxml.FXML
    public void initialize() {

        examSubjectCB.getItems().addAll("Math","Physics","Chemistry");


    }

    @javafx.fxml.FXML
    public void startExamButton(ActionEvent actionEvent) {

        examinstructionsLabel.setText("Exam Instruction :");
        exam1Label.setText("1. Do not use unfair means.");
        exam2Label.setText("2. Manage your time properly.");
        exam3Label.setText("3. Make sure internet connection is stable.");
        exam4Label.setText("4. Complete exam within time.");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
