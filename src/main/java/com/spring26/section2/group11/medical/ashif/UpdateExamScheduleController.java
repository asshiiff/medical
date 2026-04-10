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

public class UpdateExamScheduleController
{
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<Exam> examlistTable;
    @javafx.fxml.FXML
    private ComboBox<String> examCB;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> examlistCol;

    List<Exam> examList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label emptyLabel;

    @javafx.fxml.FXML
    public void initialize() {

        examlistCol.setCellValueFactory(new PropertyValueFactory<>("exam"));

        examCB.getItems().addAll("DBMS","DS","DLD");

        examList.add(new Exam("DBMS"));
        examList.add(new Exam("DS"));

        examlistTable.getItems().addAll(examList);
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        Exam selected = examlistTable.getSelectionModel().getSelectedItem();

        if (selected == null || examCB.getValue() == null || datePicker.getValue() == null) {
            emptyLabel.setText("Updated Exam and Date!");
            return;
        }

        selected.setExam(examCB.getValue() + " | " + datePicker.getValue());

        examlistTable.refresh();

        emptyLabel.setText("Updated Exam and Date!");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) emptyLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}