package com.spring26.section2.group11.medical.ashraful;

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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class incidentReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> incidentCB;
    @javafx.fxml.FXML
    private ComboBox<String> examCB;
    @javafx.fxml.FXML
    private TableView<Candidate> studentTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> canidateNameCol;

    List<Candidate> ImmunologyStudentList = new ArrayList<>();
    List<Candidate> ToxicologyStudentList = new ArrayList<>();
    List<Candidate> PharmacologyStudentList = new ArrayList<>();

    @javafx.fxml.FXML
    private Label displayLabel;

    @javafx.fxml.FXML
    public void initialize() {
        examCB.getItems().addAll("Immunology", "Toxicology", "Pharmacology");

        canidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateIdCol.setCellValueFactory(new PropertyValueFactory<>("candidateId"));

        ImmunologyStudentList.add(new Candidate("Ashraful Islam", 2010192));
        ImmunologyStudentList.add(new Candidate("Arnob Datta", 2235522));
        ImmunologyStudentList.add(new Candidate("Asif Islam", 2246466));

        ToxicologyStudentList.add(new Candidate("Mozammel Hossain", 2246446));
        ToxicologyStudentList.add(new Candidate("Abdullah Al Mamun", 2124473));

        PharmacologyStudentList.add(new Candidate("Ayman Rahman", 2014683));

        incidentCB.getItems().addAll("Copying", "Impersonation", "Disruption", "Use of Unauthorized Materials", "Plagiarism");

    }


    @javafx.fxml.FXML
    public void printReportButton(ActionEvent actionEvent) {
        Candidate candidate = studentTable.getSelectionModel().getSelectedItem();

        String incident = incidentCB.getValue();

        String exam = examCB.getValue();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("IncidentReport.txt"))) {
            writer.write("Exam: " + exam);
            writer.newLine();
            writer.write("Candidate Name: " + candidate.getCandidateName());
            writer.newLine();
            writer.write("Candidate Id: " + String.valueOf(candidate.getCandidateId()) );
            writer.newLine();
            writer.write("Incident: " + incident);

            displayLabel.setText("Report Saved");

        } catch (IOException e) {
            displayLabel.setText("Write failed");
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/invigilatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) incidentCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void loadCandidateList(ActionEvent actionEvent) {
        String exam = examCB.getValue();

        if (exam.equals("Immunology")) {
            studentTable.getItems().clear();
            studentTable.getItems().addAll(ImmunologyStudentList);
        }

        if (exam.equals("Toxicology")) {
            studentTable.getItems().clear();
            studentTable.getItems().addAll(ToxicologyStudentList);
        }

        if (exam.equals("Pharmacology")) {
            studentTable.getItems().clear();
            studentTable.getItems().addAll((PharmacologyStudentList));
        }
    }
}