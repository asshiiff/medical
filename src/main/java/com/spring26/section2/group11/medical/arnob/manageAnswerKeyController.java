package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class manageAnswerKeyController {
    @javafx.fxml.FXML
    private TextField answerKeyField;
    @javafx.fxml.FXML
    private ComboBox courseCB;
    @javafx.fxml.FXML
    private ComboBox semesterCB;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableView answerTable;
    @javafx.fxml.FXML
    private TableColumn courseCol;
    @javafx.fxml.FXML
    private TableColumn answerKeyCol;

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
