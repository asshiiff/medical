package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class studentPerformanceStatisticsController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private ComboBox<String> subjectCB;
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
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
