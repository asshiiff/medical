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

public class DeleteQuestionController
{
    @javafx.fxml.FXML
    private TableView<Exam> questionlistTable;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableColumn<Exam,Integer> questionlistCol;

    List<Exam> examList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        questionlistCol.setCellValueFactory(new PropertyValueFactory<>("question"));

        examList.add(new Exam(1));
        examList.add(new Exam(2));
        examList.add(new Exam(3));


        questionlistTable.getItems().addAll(examList);

    }

    @javafx.fxml.FXML
    public void deleteButton(ActionEvent actionEvent) {

        Exam selected = questionlistTable.getSelectionModel().getSelectedItem();

        questionlistTable.getItems().remove(selected);

        display.setText("Question deleted successfully!");
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
}