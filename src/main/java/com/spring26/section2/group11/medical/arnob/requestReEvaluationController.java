package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class requestReEvaluationController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private ComboBox<String> selectExamCB;
    @javafx.fxml.FXML
    private Label display3;
    @javafx.fxml.FXML
    private TextField reasonField;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private Label display4;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRequestButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
