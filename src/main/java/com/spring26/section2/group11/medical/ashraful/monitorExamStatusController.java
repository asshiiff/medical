package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class monitorExamStatusController
{
    @javafx.fxml.FXML
    private TableView<Candidate> candidateTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateStatusCol;
    @javafx.fxml.FXML
    private CheckBox examCompletedCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectExamCB;

    List<Candidate> ImmunologyStudentList = new ArrayList<>();
    List<Candidate> ToxicologyStudentList = new ArrayList<>();
    List<Candidate> PharmacologyStudentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectExamCB.getItems().addAll("Immunology", "Toxicology", "Pharmacology");

        candidateIdCol.setCellValueFactory(new PropertyValueFactory<>("candidateId"));
        candidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateStatusCol.setCellValueFactory(new PropertyValueFactory<>("candidateStatus"));

        ImmunologyStudentList.add(new Candidate(2010192, "Ashraful Islam", "Not Complete" ));
        ImmunologyStudentList.add(new Candidate(2235522, "Arnob Datta", "Not Complete"));
        ImmunologyStudentList.add(new Candidate(2246466, "Asif Islam", "Not Complete"));

        ToxicologyStudentList.add(new Candidate(2246446, "Mozammel Hossain", "Not Complete"));
        ToxicologyStudentList.add(new Candidate(2124473, "Abdullah Al Mamun", "Not Complete"));

        PharmacologyStudentList.add(new Candidate(2014683, "Ayman Rahman", "Not Complete"));

    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        String exam = selectExamCB.getValue();
        Candidate candidate = candidateTable.getSelectionModel().getSelectedItem();

        for (Candidate u: ImmunologyStudentList) {
            if ( u.equals(candidate) ) {
                if ( examCompletedCheckBox.isSelected() ) {
                    u.setCandidateStatus("Completed");
                    candidateTable.getItems().clear();
                    candidateTable.getItems().addAll(ImmunologyStudentList);
                }
            }

        }

        for (Candidate u: ToxicologyStudentList) {
            if ( u.equals(candidate) ) {
                if ( examCompletedCheckBox.isSelected() ) {
                    u.setCandidateStatus("Completed");
                    candidateTable.getItems().clear();
                    candidateTable.getItems().addAll(ImmunologyStudentList);
                }
            }

        }

        for (Candidate u: PharmacologyStudentList) {
            if ( u.equals(candidate) ) {
                if ( examCompletedCheckBox.isSelected() ) {
                    u.setCandidateStatus("Completed");
                    candidateTable.getItems().clear();
                    candidateTable.getItems().addAll(ImmunologyStudentList);
                }
            }

        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/invigilatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) examCompletedCheckBox.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void loadCandidatesButton(ActionEvent actionEvent) {
        String exam = selectExamCB.getValue();

        if (exam.equals("Immunology")) {
            candidateTable.getItems().clear();
            candidateTable.getItems().addAll(ImmunologyStudentList);
        }

        if (exam.equals("Toxicology")) {
            candidateTable.getItems().clear();
            candidateTable.getItems().addAll(ToxicologyStudentList);
        }

        if (exam.equals("Pharmacology")) {
            candidateTable.getItems().clear();
            candidateTable.getItems().addAll((PharmacologyStudentList));
        }
    }
}