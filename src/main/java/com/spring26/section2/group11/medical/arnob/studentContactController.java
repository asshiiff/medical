package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class studentContactController {
    @javafx.fxml.FXML
    private TableColumn<Student, String> numberCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> studentNameCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> addressCol;
    @javafx.fxml.FXML
    private TableView<Student> contactTable;
    @javafx.fxml.FXML
    private Label displayLabel;

    List<Student> studentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        numberCol.setCellValueFactory(new PropertyValueFactory<>("Number"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));

        studentList.add(new Student("Arnob","GP: 01799522291","Kishoreganj"));
        studentList.add(new Student("ASif","Robi: 01854073499","Dhaka"));
        studentList.add(new Student("AShraf","Teletalk: 01580727012","Sylhet"));

    }

    @javafx.fxml.FXML
    public void checkButton(ActionEvent actionEvent) {

        contactTable.getItems().addAll(studentList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) displayLabel .getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
