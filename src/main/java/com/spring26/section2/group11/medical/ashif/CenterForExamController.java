package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CenterForExamController
{
    @javafx.fxml.FXML
    private ComboBox<String> centerCB;
    @javafx.fxml.FXML
    private Label display;

    @javafx.fxml.FXML
    public void initialize() {

        centerCB.getItems().addAll("Bonolota","Monorom","Nilima");
    }

    @javafx.fxml.FXML
    public void centerButton(ActionEvent actionEvent) {

        String selectedCenter = centerCB.getValue();

        display.setText("Selected Center: " + selectedCenter);

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) centerCB .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}