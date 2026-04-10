package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class archiveOldExamDataController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableView<Oldexam> oldExamTable;
    @javafx.fxml.FXML
    private TableColumn<Oldexam, String> subjectCol;
    @javafx.fxml.FXML
    private TableColumn<Oldexam, String> semesterCol;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private TableColumn<Oldexam, LocalDate> dateCol;

    List<Oldexam> oldexamList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        semesterCol.setCellValueFactory(new PropertyValueFactory<>("semester"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        oldexamList.add(new Oldexam("Math","Spring",LocalDate.of(2025,2,10)));
        oldexamList.add(new Oldexam("Physics","Autumn",LocalDate.of(2025,5,23)));
        oldexamList.add(new Oldexam("Chemistry","Summer",LocalDate.of(2025,6,21)));


    }

    @javafx.fxml.FXML
    public void dataButton(ActionEvent actionEvent) {

        oldExamTable.getItems().addAll(oldexamList);
        display2.setText("Data Archive Data Done");


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
