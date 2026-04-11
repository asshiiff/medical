package com.spring26.section2.group11.medical.ashif;

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

public class EditQuestionPaperController
{
    @javafx.fxml.FXML
    private ComboBox<String> difficultyCB;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> questionListCol;
    @javafx.fxml.FXML
    private TableView<Exam> questionListTable;
    @javafx.fxml.FXML
    private TextArea textArea;

    List<Exam> examList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label display;

    @javafx.fxml.FXML
    public void initialize() {

        questionListCol.setCellValueFactory(new PropertyValueFactory<>("question"));
        difficultyCB.getItems().addAll("Easy","Medium","Hard");

        examList.add(new Exam(1));
        examList.add(new Exam(2));
        examList.add(new Exam(3));

        questionListTable.getItems().addAll(examList);


    }

    @javafx.fxml.FXML
    public void changeButton(ActionEvent actionEvent) {

        display.setText("Edit Question Successfully");

        questionListTable.refresh();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/questionSetterDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) difficultyCB .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}