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

public class ViewexamresultsController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Student,String> rankCol;
    @javafx.fxml.FXML
    private TableColumn<Student,String> subjectCol;
    @javafx.fxml.FXML
    private TableView<Student> viewResultTable;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> totalCol;
    @javafx.fxml.FXML
    private Label viewLabel;

    List<Student> studentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        subjectCol.setCellValueFactory( new PropertyValueFactory<>("subject"));
        marksCol.setCellValueFactory( new PropertyValueFactory<>("marks"));
        totalCol.setCellValueFactory( new PropertyValueFactory<>("total"));
        rankCol.setCellValueFactory( new PropertyValueFactory<>("rank"));

        studentList.add(new Student("Math", 80, 100, "1st"));
        studentList.add(new Student("Physics", 70, 100, "2nd"));
        studentList.add(new Student("Chemistry", 60, 100, "3rd"));



    }

    @javafx.fxml.FXML
    public void viewResultButton(ActionEvent actionEvent) {

        viewResultTable.getItems().addAll(studentList);

        viewLabel.setText("Exam Result Show by Ranking");
    }



    @javafx.fxml.FXML
    public void backtButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {

        viewResultTable.getItems().clear();
        viewLabel.setText("");
    }
}
