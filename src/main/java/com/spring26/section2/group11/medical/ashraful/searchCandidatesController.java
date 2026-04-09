package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class searchCandidatesController
{
    @javafx.fxml.FXML
    private TableView<Candidate> candidateTable;
    @javafx.fxml.FXML
    private TextField candidateIdField;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateExamCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchCandidate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}