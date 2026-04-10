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
import java.util.ArrayList;
import java.util.List;

public class EvalutorCreatesRankingController {
    @javafx.fxml.FXML
    private TableColumn<Student, String> studentNameCol;
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> rankCol;
    @javafx.fxml.FXML
    private TableView<Student> rankTable;
    @javafx.fxml.FXML
    private Label generateRankingLabel;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> studentIdCol;
    @javafx.fxml.FXML
    private Label successfullyLabel;

    List<Student> studentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        rankCol.setCellValueFactory( new PropertyValueFactory<>("rank"));
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("studentName"));

        studentList.add( new Student("Arnob Datta",2221684,"1st",80));
        studentList.add(new Student("Ashraful Islam",2010192,"2nd",70));
        studentList.add(new Student("Ashif Islam",2230191,"3rd",60));

    }

    @javafx.fxml.FXML
    public void saveRankingButton(ActionEvent actionEvent) {

       successfullyLabel.setText("Save Successfuuly");


    }

    @javafx.fxml.FXML
    public void generateRankingButton(ActionEvent actionEvent) {

        rankTable.getItems().addAll(studentList);

        generateRankingLabel.setText("Generate Ranking Done");
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

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {


        rankTable.getItems().clear();

        generateRankingLabel.setText("");

        successfullyLabel.setText("");

    }
}
