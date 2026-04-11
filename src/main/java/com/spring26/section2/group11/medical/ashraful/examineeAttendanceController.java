package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import com.spring26.section2.group11.medical.arnob.Student;
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

public class examineeAttendanceController
{
    @javafx.fxml.FXML
    private ComboBox<String> examsCB;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Boolean> attendanceCol;
    @javafx.fxml.FXML
    private TableView<Candidate> attendanceTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateNameCol;
    @javafx.fxml.FXML
    private TableColumn<Candidate, Integer> candidateIdCol;

    List<Candidate> ImmunologyCandidateList = new ArrayList<>();
    List<Candidate> PhysiologyCandidateList = new ArrayList<>();
    List<Candidate> ToxicologyCandidateList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label displayLabel;


    @javafx.fxml.FXML
    public void initialize() {
        candidateNameCol.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        candidateIdCol.setCellValueFactory(new PropertyValueFactory<>("candidateId"));
        attendanceCol.setCellValueFactory(new PropertyValueFactory<>("candidateAttendance"));


        examsCB.getItems().addAll("Immunology", "Physiology", "Toxicology");

        ImmunologyCandidateList.add(new Candidate("Ashraful Islam", 2010192, false));
        ImmunologyCandidateList.add(new Candidate("Arnob Datta", 2235522, false));
        ImmunologyCandidateList.add(new Candidate("Asif Islam", 2246466, false));

        PhysiologyCandidateList.add(new Candidate("Mozammel Hossain", 2246446, false));
        PhysiologyCandidateList.add(new Candidate("Abdullah Al Mamun", 2124473, false));

        ToxicologyCandidateList.add(new Candidate("Ayman Rahman", 2014683, false));


    }


    @javafx.fxml.FXML
    public void submitAttendanceButton(ActionEvent actionEvent) {
        String exam = examsCB.getValue();

        if ( exam.equals("Immunology") ) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("ImmunologyAttendance.txt"))) {
                for (Candidate u: ImmunologyCandidateList) {
                    writer.write( u.getCandidateName() + " " );
                    writer.write( String.valueOf(u.getCandidateId()) + " " );
                    writer.write( String.valueOf(u.isCandidateAttendance()) );
                    writer.newLine();
                }

                displayLabel.setText("Attendance Saved");

            } catch (IOException e) {
                displayLabel.setText("File Write Failed");
            }
        }

        if ( exam.equals("Physiology") ) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("PhysiologyAttendance.txt"))) {
                for (Candidate u: PhysiologyCandidateList) {
                    writer.write( u.getCandidateName() + " " );
                    writer.write( String.valueOf(u.getCandidateId()) + " " );
                    writer.write( String.valueOf(u.isCandidateAttendance()) );
                    writer.newLine();
                }

                displayLabel.setText("Attendance Saved");

            } catch (IOException e) {
                displayLabel.setText("File Write Failed");
            }
        }

        if ( exam.equals("Toxicology") ) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("ToxicologyAttendance.txt"))) {
                for (Candidate u: ToxicologyCandidateList) {
                    writer.write( u.getCandidateName() + " " );
                    writer.write( String.valueOf(u.getCandidateId()) + " " );
                    writer.write( String.valueOf(u.isCandidateAttendance()) );
                    writer.newLine();
                }

                displayLabel.setText("Attendance Saved");

            } catch (IOException e) {
                displayLabel.setText("File Write Failed");
            }
        }
    }

    @javafx.fxml.FXML
    public void loadStudentListButton(ActionEvent actionEvent) {
        String exam = examsCB.getValue();

        if ( exam.equals("Immunology") ) {
            attendanceTable.getItems().clear();
            attendanceTable.getItems().addAll(ImmunologyCandidateList);
        }

        if ( exam.equals("Physiology") ) {
            attendanceTable.getItems().clear();
            attendanceTable.getItems().addAll(PhysiologyCandidateList);
        }

        if ( exam.equals("Toxicology") ) {
            attendanceTable.getItems().clear();
            attendanceTable.getItems().addAll(ToxicologyCandidateList);
        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/invigilatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) examsCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void giveAttendanceButton(ActionEvent actionEvent) {
        Candidate candidate = attendanceTable.getSelectionModel().getSelectedItem();

        for (Candidate u: ImmunologyCandidateList) {
            if ( u.equals(candidate) ) {
                u.setCandidateAttendance(true);
                attendanceTable.getItems().clear();
                attendanceTable.getItems().addAll(ImmunologyCandidateList);
            }
        }

        for (Candidate u: PhysiologyCandidateList) {
            if ( u.equals(candidate) ) {
                u.setCandidateAttendance(true);
                attendanceTable.getItems().clear();
                attendanceTable.getItems().addAll(PhysiologyCandidateList);
            }
        }

        for (Candidate u: ToxicologyCandidateList) {
            if ( u.equals(candidate) ) {
                u.setCandidateAttendance(true);
                attendanceTable.getItems().clear();
                attendanceTable.getItems().addAll(ToxicologyCandidateList);
            }
        }

    }
}