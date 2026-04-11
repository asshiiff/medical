package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class viewCandidateListController
{
    @javafx.fxml.FXML
    private TableView<Candidate> candidateTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateExamCol;

    List<Candidate> studentList = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        candidateIdCol.setCellValueFactory(new PropertyValueFactory<>("candidateId"));
        candidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateExamCol.setCellValueFactory(new PropertyValueFactory<>("candidateExam"));

        studentList.add(new Candidate(2010192, "Ashraful Islam", "Immunology", null));
        studentList.add(new Candidate(2235522, "Arnob Datta", "Immunology", null));
        studentList.add(new Candidate(2246466, "Asif Islam", "Immunology", null));
        studentList.add(new Candidate(2246446, "Mozammel Hossain", "Toxicology", null));
        studentList.add(new Candidate(2124473, "Abdullah Al Mamun", "Toxicology", null));
        studentList.add(new Candidate(2014683, "Ayman Rahman", "Pharmacology", null));

    }

    @javafx.fxml.FXML
    public void loadRegisteredCandidates(ActionEvent actionEvent) {
        candidateTable.getItems().addAll(studentList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) candidateTable.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}