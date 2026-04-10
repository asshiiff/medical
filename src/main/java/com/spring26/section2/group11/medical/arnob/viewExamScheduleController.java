package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class viewExamScheduleController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableView<Student> examTable;
    @javafx.fxml.FXML
    private TableColumn<Student, String> subjectCol;
    @FXML
    private TableColumn<Student, String> roomCol;

    List<Student> studentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        roomCol.setCellValueFactory(new PropertyValueFactory<>("room"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        studentList.add(new Student("Math","BC 6002",LocalDate.of(2026,4,10)));
        studentList.add(new Student("Physics","BC 5006",LocalDate.of(2026,4,12)));
        studentList.add(new Student("Chemistry","BC 8009",LocalDate.of(2026,4,21)));

        examTable.getItems().addAll(studentList);


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
