package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class approveApplicationController
{
    @javafx.fxml.FXML
    private TableView<Candidate> applicationsTable;
    @javafx.fxml.FXML
    private ComboBox<String> examsCB;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> applicationsCol;

    static List<Candidate> ImmunologyApplicationsList = new ArrayList<>();
    static List<Candidate> ToxicologyApplicationsList = new ArrayList<>();
    static List<Candidate> PharmacologyApplicationsList = new ArrayList<>();

    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Double> candidateCGPACol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Boolean> applicationStatusCol;

    @javafx.fxml.FXML
    public void initialize() {
        applicationsCol.setCellValueFactory(new PropertyValueFactory<>("application"));
        candidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateCGPACol.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
        applicationStatusCol.setCellValueFactory(new PropertyValueFactory<>("applicationStatus"));

        ImmunologyApplicationsList.add(new Candidate("ImmuApp01", "Ashraful Islam", 3.22, false));
        ImmunologyApplicationsList.add(new Candidate("ImmuApp02", "Asif Islam", 3.00, false));

        ToxicologyApplicationsList.add(new Candidate("ToxApp01", "Arnob Datta", 3.1, false));
        ToxicologyApplicationsList.add(new Candidate("ToxApp02", "Anik Hossain", 2.7, false));
        ToxicologyApplicationsList.add(new Candidate("ToxApp03", "Abdullah Al Mamun", 2.5, false));

        PharmacologyApplicationsList.add(new Candidate("PharmaApp01", "Mozammel Hossain Masum", 3.4, false));

        examsCB.getItems().addAll("Immunology", "Toxicology", "Pharmacology");



    }

    @javafx.fxml.FXML
    public void checkApplicationsButton(ActionEvent actionEvent) {
        String exam = examsCB.getValue();

        if ( exam.equals("Immunology") ) {
            applicationsTable.getItems().clear();
            applicationsTable.getItems().addAll(ImmunologyApplicationsList);
        }

        if ( exam.equals("Toxicology") ) {
            applicationsTable.getItems().clear();
            applicationsTable.getItems().addAll(ToxicologyApplicationsList);
        }

        if ( exam.equals("Pharmacology") ) {
            applicationsTable.getItems().clear();
            applicationsTable.getItems().addAll(PharmacologyApplicationsList);
        }


    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
        Candidate candidate = applicationsTable.getSelectionModel().getSelectedItem();

        for (Candidate u: ImmunologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(false);
                applicationsTable.getItems().clear();
                applicationsTable.getItems().addAll(ImmunologyApplicationsList);
            }

        }

        for (Candidate u: ToxicologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(false);
                applicationsTable.getItems().addAll(ToxicologyApplicationsList);
            }
        }

        for (Candidate u: PharmacologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(false);
                applicationsTable.getItems().addAll(PharmacologyApplicationsList);

            }
        }


    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
        Candidate candidate = applicationsTable.getSelectionModel().getSelectedItem();

        for (Candidate u: ImmunologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(true);
                applicationsTable.getItems().clear();
                applicationsTable.getItems().addAll(ImmunologyApplicationsList);
            }

        }

        for (Candidate u: ToxicologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(true);
                applicationsTable.getItems().clear();
                applicationsTable.getItems().addAll(ToxicologyApplicationsList);
            }
        }

        for (Candidate u: PharmacologyApplicationsList) {
            if ( u.equals(candidate) ) {
                u.setApplicationStatus(true);
                applicationsTable.getItems().clear();
                applicationsTable.getItems().addAll(PharmacologyApplicationsList);

            }
        }


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) examsCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}