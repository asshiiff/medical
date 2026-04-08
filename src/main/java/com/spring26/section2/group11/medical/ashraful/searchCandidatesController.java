package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class searchCandidatesController
{
    @javafx.fxml.FXML
    private TableView candidateTable;
    @javafx.fxml.FXML
    private TextField candidateIdField;
    @javafx.fxml.FXML
    private TableColumn candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn candidateExamCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchCandidate(ActionEvent actionEvent) {
    }
}