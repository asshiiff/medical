package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;

public class DateAndTimeForExamController
{
    @javafx.fxml.FXML
    private ComboBox<String> timeCB;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    @javafx.fxml.FXML
    public void initialize() {

        timeCB.getItems().addAll("Morning","Day","Afternoon","Evening");
    }

    @javafx.fxml.FXML
    public void dateAndTimeButton(ActionEvent actionEvent) {

        if (datePicker.getValue() == null || timeCB.getValue() == null) {
            System.out.println("Please select both date and time!");
            return;
        }

        System.out.println("Exam scheduled on: "
                + datePicker.getValue()
                + " at "
                + timeCB.getValue());
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/examControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) timeCB .getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}