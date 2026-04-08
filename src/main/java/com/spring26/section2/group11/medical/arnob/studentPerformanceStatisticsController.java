package com.spring26.section2.group11.medical.arnob;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class studentPerformanceStatisticsController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private ComboBox subjectCB;
    @javafx.fxml.FXML
    private DatePicker toLocalDate;
    @javafx.fxml.FXML
    private DatePicker fromLocalDate;
    @javafx.fxml.FXML
    private Label display3;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private PieChart resultChart;
    @javafx.fxml.FXML
    private Label display4;

    @javafx.fxml.FXML
    public void statisticsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}
