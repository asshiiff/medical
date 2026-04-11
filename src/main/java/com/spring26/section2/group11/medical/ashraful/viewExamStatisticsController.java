package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class viewExamStatisticsController
{
    @javafx.fxml.FXML
    private PieChart distributionPieChart;

    List<Candidate> studentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        studentList.add(new Candidate(2010192, "Ashraful Islam", "Immunology", null));
        studentList.add(new Candidate(2235522, "Arnob Datta", "Immunology", null));
        studentList.add(new Candidate(2246466, "Asif Islam", "Immunology", null));
        studentList.add(new Candidate(2246446, "Mozammel Hossain", "Toxicology", null));
        studentList.add(new Candidate(2124473, "Abdullah Al Mamun", "Toxicology", null));
        studentList.add(new Candidate(2014683, "Ayman Rahman", "Pharmacology", null));
    }

    @javafx.fxml.FXML
    public void showDistributionButton(ActionEvent actionEvent) {
        double immunologyCount = 0;
        double toxicologyCount = 0;
        double pharmacologyCount = 0;
        double totalCount = 0;

        for (Candidate u : studentList) {
            if (u.getCandidateExam().equals("Immunology")) {
                immunologyCount = immunologyCount + 1;
                totalCount = totalCount + 1;
            }

            if (u.getCandidateExam().equals("Toxicology")) {
                toxicologyCount = toxicologyCount + 1;
                totalCount = totalCount + 1;
            }

            if (u.getCandidateExam().equals("Pharmacology")) {
                pharmacologyCount = pharmacologyCount + 1;
                totalCount = totalCount + 1;
            }
        }

        double immunoPercentage = (immunologyCount/totalCount) * 100;
        double toxicoPercentage = (toxicologyCount/totalCount) * 1000;
        double pharmaPercentage = (pharmacologyCount/totalCount) * 100;

        distributionPieChart.getData().add(new PieChart.Data("Immunology", immunoPercentage));
        distributionPieChart.getData().add(new PieChart.Data("Toxicology", toxicoPercentage));
        distributionPieChart.getData().add(new PieChart.Data("Pharmacology", pharmaPercentage));


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) distributionPieChart.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}