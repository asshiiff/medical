package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ChecksAnswersAndGivesMarksController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> studentIdCol;
    @javafx.fxml.FXML
    private TextField fileField;
    @javafx.fxml.FXML
    private TableView<Student> answerTable;
    @javafx.fxml.FXML
    private Label display3;
    @javafx.fxml.FXML
    private Label display2;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void uploadButton(ActionEvent actionEvent) {
    }
}
