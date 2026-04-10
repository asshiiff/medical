package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateReportsController
{
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private ComboBox<String> selectExamCB;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> examCol;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> reportCol;
    @javafx.fxml.FXML
    private TableView<Exam> examReportTable;

    List<Exam> examlist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        examCol.setCellValueFactory(new PropertyValueFactory<>("exam"));
        reportCol.setCellValueFactory(new PropertyValueFactory<>("report"));
        selectExamCB.getItems().addAll("Exam 1","Exam 2","Exam 3");
        reportTypeCB.getItems().addAll("CSV");

        examlist.add(new Exam("Pharmacology","CRV",null));
        examReportTable.getItems().addAll(examlist);

    }

    @javafx.fxml.FXML
    public void downloadButton(ActionEvent actionEvent) {

        Exam selected = examReportTable.getSelectionModel().getSelectedItem();

        if (selected == null) {
            display.setText("Select a report first!");
            return;
        }

        display.setText("Downloading report for " + selected.getExam() + "...");


    }

    @javafx.fxml.FXML
    public void reportButton(ActionEvent actionEvent) {

        String exam = selectExamCB.getValue();
        String reportType = reportTypeCB.getValue();

        if (exam == null || reportType == null) {
            display.setText("Please select exam and report type!");
            return;
        }

        Exam newReport = new Exam(exam, reportType, null);

        examReportTable.getItems().add(newReport);

        display.setText("Report generated!");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) display .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}