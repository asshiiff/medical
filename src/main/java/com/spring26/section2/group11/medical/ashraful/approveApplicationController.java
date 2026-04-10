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

    List<Candidate> ImmunologyApplicationsList = new ArrayList<>();
    List<Candidate> ToxicologyApplicationsList = new ArrayList<>();
    List<Candidate> PharmacologyApplicationsList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        applicationsCol.setCellValueFactory(new PropertyValueFactory<>("application"));

        ImmunologyApplicationsList.add(new Candidate("ImmuApp01"));
        ImmunologyApplicationsList.add(new Candidate("ImmuApp02"));

        ToxicologyApplicationsList.add(new Candidate("ToxApp01"));
        ToxicologyApplicationsList.add(new Candidate("ToxApp02"));
        ToxicologyApplicationsList.add(new Candidate("ToxApp03"));

        PharmacologyApplicationsList.add(new Candidate("PharmaApp01"));

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
    public void reviewApplicationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
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