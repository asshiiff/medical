package com.spring26.section2.group11.medical.ashif;

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

public class CreateQuestionPaperController
{
    @javafx.fxml.FXML
    private TableView<Exam> quesstionPaperTable;
    @javafx.fxml.FXML
    private TableColumn<Exam,Double> totalScoreCol;
    @javafx.fxml.FXML
    private TableColumn<Exam,Double> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Exam,Integer> rankCol;
    @javafx.fxml.FXML
    private Label display;

    List<Exam> examList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        totalScoreCol.setCellValueFactory(new PropertyValueFactory<>("totalScore"));
        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("rank"));

        examList.add(new Exam(50,20,10));
        examList.add(new Exam(50,48,1));

        quesstionPaperTable.getItems().addAll(examList);
    }



    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/questionSetterDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) display.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}