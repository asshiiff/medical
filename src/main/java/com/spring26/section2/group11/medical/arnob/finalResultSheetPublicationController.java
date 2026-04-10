package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class finalResultSheetPublicationController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> marksCol;
    @javafx.fxml.FXML
    private TableView<Student> resultTable;
    @javafx.fxml.FXML
    private TableColumn<Student, String> gradeCol;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> studentIdCol;
    @javafx.fxml.FXML
    private TextField studentIdField;
    @javafx.fxml.FXML
    private TextField marksField;
    @javafx.fxml.FXML
    private TextField gradeField;
    @javafx.fxml.FXML
    private Label finalresultLabel;

    List<Student> studentList =new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
        gradeCol.setCellValueFactory(new PropertyValueFactory<>("grade"));

        resultTable.getItems().addAll(studentList);

    }

    @javafx.fxml.FXML
    public void publishButton(ActionEvent actionEvent) {

        finalresultLabel.setText("Final Result Publish Done");

    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {

        int studentId = Integer.parseInt(studentIdField.getText());
        int marks = Integer.parseInt(marksField.getText());

        String grade = gradeField.getText();

        Student s = new Student(studentId,marks,grade);

        resultTable.getItems().add(s);
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
    public void refreshButton(ActionEvent actionEvent) {

        finalresultLabel.setText("");

        resultTable.getItems().clear();

        studentIdField.clear();
        marksField.clear();
        gradeField.clear();

    }
}
