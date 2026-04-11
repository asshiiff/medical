package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class contactTeacherController {
    @javafx.fxml.FXML
    private TextField messageField;
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private Label display3;
    @javafx.fxml.FXML
    private ComboBox<String> teacherNameCB;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private Label sendLabel;


    @javafx.fxml.FXML
    public void initialize() {

        teacherNameCB.getItems().addAll("Dr.Tanvir Hasan,PhD","Dr.Khaled Islam,PhD","Dr.Fahim Uddin,PhD","Dr.Imran Hossain,PhD");

    }


    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) {

        String teacherName = teacherNameCB.getValue();
        String message = messageField.getText();

        if(teacherName != null && !message.isEmpty()){

            sendLabel.setText("Message sent to " + teacherName);
            teacherNameCB.setValue(null);
            messageField.clear();
        }
        else{
            sendLabel.setText("Please select teacher and write message");
        }
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


    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {

        sendLabel.setText("");
    }
}
