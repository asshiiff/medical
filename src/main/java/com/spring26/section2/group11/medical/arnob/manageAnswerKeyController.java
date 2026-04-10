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

public class manageAnswerKeyController {
    @javafx.fxml.FXML
    private TextField answerKeyField;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableView<Course> answerTable;
    @javafx.fxml.FXML
    private TableColumn<Course,String> courseCol;
    @javafx.fxml.FXML
    private TableColumn<Course,String> answerKeyCol;
    @javafx.fxml.FXML
    private TextField courseField;

    List<Course> courseList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {



        courseCol.setCellValueFactory( new PropertyValueFactory<>("course"));
        answerKeyCol.setCellValueFactory( new PropertyValueFactory<>("answerKey"));

        courseList.add( new Course("Math","A B D C"));
        courseList.add( new Course("Physics","B D E F"));
        courseList.add( new Course("Chemistry","C B A F"));

        answerTable.getItems().addAll(courseList);


    }
    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

        String course = courseField.getText();
        String answerKey = answerKeyField.getText();

        Course c = new Course(course,answerKey);

        answerTable.getItems().add(c);

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
