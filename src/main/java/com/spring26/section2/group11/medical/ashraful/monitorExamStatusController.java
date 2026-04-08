package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class monitorExamStatusController
{
    @javafx.fxml.FXML
    private TableView candidateTable;
    @javafx.fxml.FXML
    private TableColumn candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn candidateNameCol;
    @javafx.fxml.FXML
    private ComboBox selectCandidateCB;
    @javafx.fxml.FXML
    private TableColumn candidateStatusCol;
    @javafx.fxml.FXML
    private CheckBox examCompletedCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}