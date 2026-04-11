package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveQuestionBankController
{
    @javafx.fxml.FXML
    private ComboBox<String> subjectCB;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> questionCol;
    @javafx.fxml.FXML
    private ComboBox<String> difficultyCB;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableView<Exam> questionTable;
    @javafx.fxml.FXML
    private TextArea textArea;

    List<Exam> examList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        questionCol.setCellValueFactory(new PropertyValueFactory<>("question"));
        subjectCB.getItems().addAll("System","DBMS","DS");
        difficultyCB.getItems().addAll("Easy","Medium","Hard");
        examList.add(new Exam(1));
        examList.add(new Exam(2));

        questionTable.getItems().addAll(examList);

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
    public void addQuestionButton(ActionEvent actionEvent) {

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("ashif.txt")) ) {
            writer.write(textArea.getText());
            writer.newLine();

        } catch ( IOException e ) {
            System.out.println("Write Failed");

        }

        display.setText("Added Question!");
    }
}