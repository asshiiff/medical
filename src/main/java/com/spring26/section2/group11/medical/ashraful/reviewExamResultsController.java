package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    List<Candidate> ImmunologyStudentList = new ArrayList<>();
    List<Candidate> ToxicologyStudentList = new ArrayList<>();
    List<Candidate> PharmacologyStudentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        selectExamCB.getItems().addAll("Immunology", "Toxicology", "Pharmacology");

        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("candidateScore"));

        ImmunologyStudentList.add(new Candidate("Ashraful Islam", 93.5));
        ImmunologyStudentList.add(new Candidate("Arnob Datta",  81.2));
        ImmunologyStudentList.add(new Candidate("Asif Islam", 71.1));

        ToxicologyStudentList.add(new Candidate("Mozammel Hossain", 95.1 ));
        ToxicologyStudentList.add(new Candidate("Abdullah Al Mamun", 61.6));

        PharmacologyStudentList.add(new Candidate("Ayman Rahman", 80.4));
    }

    @javafx.fxml.FXML
    public void loadExamResultsButton(ActionEvent actionEvent) {
        String exam = selectExamCB.getValue();

        if (exam.equals("Immunology")) {
            resultsTable.getItems().clear();
            resultsTable.getItems().addAll(ImmunologyStudentList);
        }

        if (exam.equals("Toxicology")) {
            resultsTable.getItems().clear();
            resultsTable.getItems().addAll(ToxicologyStudentList);
        }

        if (exam.equals("Pharmacology")) {
            resultsTable.getItems().clear();
            resultsTable.getItems().addAll((PharmacologyStudentList));
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) selectExamCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}