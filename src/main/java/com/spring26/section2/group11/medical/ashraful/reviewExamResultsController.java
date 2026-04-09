package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.jar.Attributes;

public class reviewExamResultsController
{
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> studentNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> scoreCol;
    @javafx.fxml.FXML
    private PieChart passFailPercentPieChart;
    @javafx.fxml.FXML
    private ComboBox<String> selectExamCB;
    @javafx.fxml.FXML
    private TableView<Candidate> resultsTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadExamResultsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}