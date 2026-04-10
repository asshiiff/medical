package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import com.spring26.section2.group11.medical.arnob.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void attendanceTabButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitAttendanceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadStudentListButton(ActionEvent actionEvent) {
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
}