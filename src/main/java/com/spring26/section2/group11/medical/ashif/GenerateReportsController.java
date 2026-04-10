package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateReportsController
{
    @javafx.fxml.FXML
    private TableView<Exam> previousDataTable;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableColumn<Exam,String> previousDataCol;
    @javafx.fxml.FXML
    private ComboBox<String> selectExamCB;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) display .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}