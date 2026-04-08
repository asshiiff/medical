package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class reviewExamResultsController
{
    @javafx.fxml.FXML
    private TableColumn studentNameCol;
    @javafx.fxml.FXML
    private TableColumn scoreCol;
    @javafx.fxml.FXML
    private PieChart passFailPercentPieChart;
    @javafx.fxml.FXML
    private ComboBox selectExamCB;
    @javafx.fxml.FXML
    private TableView resultsTable;

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