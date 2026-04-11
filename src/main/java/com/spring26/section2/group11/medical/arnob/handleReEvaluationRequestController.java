package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class handleReEvaluationRequestController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TextField studentIdField;
    @javafx.fxml.FXML
    private TextField requestMarksField;
    @javafx.fxml.FXML
    private TableColumn<Handelrequest, Integer> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Handelrequest, String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<Handelrequest, Integer> studentIdCol;
    @javafx.fxml.FXML
    private TextField reasonField;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private TableColumn<Handelrequest, String> subjectCol;
    @javafx.fxml.FXML
    private TableView<Handelrequest> requestTable;
    @javafx.fxml.FXML
    private ComboBox<String> subjectCB;

    List<Handelrequest> handelrequestList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        subjectCB.getItems().addAll("Math","Physics","Chemistry");
        statusCB.getItems().addAll("Pending","Approved");

    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        String subject = statusCB.getValue();

        int sid = Integer.parseInt(studentIdField.getText());
        int marks = Integer.parseInt(requestMarksField.getText());

        String status = statusCB.getValue();
        String reason = reasonField.getText();


        Handelrequest h = new Handelrequest(subject, sid, marks, status, reason);

        requestTable.getItems().add(h);


    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
