package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class AnalyzeQuestionDistributionController
{
    @javafx.fxml.FXML
    private TableColumn<Exam,Integer> typeCol;
    @javafx.fxml.FXML
    private TableView<Exam> questionDistributionTable;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> eventCol;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> descriptionCol;

    List<Exam> examList = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {

        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        eventCol.setCellValueFactory(new PropertyValueFactory<>("event"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        examList.add(new Exam("Friday","Written exam",1));

        questionDistributionTable.getItems().addAll(examList);


    }




    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/questionSetterDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) display .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void saveQuestionDescriptionButton(ActionEvent actionEvent) {

        display.setText("Saved Successfully");

    }
}