package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class generateApprovalListController
{
    @javafx.fxml.FXML
    private TableView<Candidate> applicationsTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> applicationsListCol;
    @javafx.fxml.FXML
    private PieChart approvedRejectedPieChart;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Boolean> applicationApprovedCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Double> candidateCgpaCol;

    List<Candidate> ImmunologyApprovalList = approveApplicationController.ImmunologyApplicationsList;
    List<Candidate> ToxicologyApprovalList = approveApplicationController.ToxicologyApplicationsList;
    List<Candidate> PharmacologyApprovalList = approveApplicationController.PharmacologyApplicationsList;

    @javafx.fxml.FXML
    public void initialize() {

        applicationsListCol.setCellValueFactory(new PropertyValueFactory<>("application"));
        candidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateCgpaCol.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
        applicationApprovedCol.setCellValueFactory(new PropertyValueFactory<>("applicationStatus"));

        applicationsTable.getItems().addAll(ImmunologyApprovalList);
        applicationsTable.getItems().addAll(ToxicologyApprovalList);
        applicationsTable.getItems().addAll(PharmacologyApprovalList);
    }

    @javafx.fxml.FXML
    public void downloadListButton(ActionEvent actionEvent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("approvalList.txt"))) {
            for (Candidate u: ImmunologyApprovalList) {
                writer.write(u.getApplication() + " ");
                writer.write(u.getCandidateName() + " ");
                writer.write(u.getCgpa() + " ");
                writer.write( String.valueOf(u.isApplicationStatus()) );
                writer.newLine();
            }

            for (Candidate u: ToxicologyApprovalList) {
                writer.write(u.getApplication() + " ");
                writer.write(u.getCandidateName() + " ");
                writer.write(u.getCgpa() + " ");
                writer.write( String.valueOf(u.isApplicationStatus()) );
                writer.newLine();
            }

            for (Candidate u: PharmacologyApprovalList) {
                writer.write(u.getApplication() + " ");
                writer.write(u.getCandidateName() + " ");
                writer.write(u.getCgpa() + " ");
                writer.write( String.valueOf(u.isApplicationStatus()) );
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("File write failed");
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) applicationsTable.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}