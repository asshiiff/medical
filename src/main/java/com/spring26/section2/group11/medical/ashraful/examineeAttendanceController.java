package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.arnob.Student;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class examineeAttendanceController
{
    @javafx.fxml.FXML
    private ComboBox<String> examsCB;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Boolean> attendanceCol;
    @javafx.fxml.FXML
    private TableView<Candidate> attendanceTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void attendanceTabButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitAttendanceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadStudentListButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}