package com.spring26.section2.group11.medical.ashif;

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

public class CancelResheduleExamController
{
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox<String> newTimeCB;
    @javafx.fxml.FXML
    private TableView<Exam> examlistTable;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> examlistCol;

    List<Exam> examList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        examlistCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        newTimeCB.getItems().addAll("9:00 AM", "12:00 PM", "3:00 PM");


        examList.add(new Exam("Math Exam"));
        examList.add(new Exam("Physics Exam"));
        examList.add(new Exam("Chemistry Exam"));

        examlistTable.getItems().addAll(examList);

    }

    @javafx.fxml.FXML
    public void resheduleButton(ActionEvent actionEvent) {

        display.setText("Rescheduled successfully!");

    }

    @javafx.fxml.FXML
    public void cancelButton(ActionEvent actionEvent) {

        Exam selectedExam = examlistTable.getSelectionModel().getSelectedItem();

        examlistTable.getItems().remove(selectedExam);

        display.setText("Cancelled!");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) display .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}