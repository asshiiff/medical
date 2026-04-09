package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class incidentReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> incidentCB;
    @javafx.fxml.FXML
    private ComboBox<String> selectStudentCB;
    @javafx.fxml.FXML
    private ComboBox<String> examCB;
    @javafx.fxml.FXML
    private TableView<Candidate> studentTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> canidateNameCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void printReportButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void reportTabButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}