package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PreviewQuestionPaperController
{
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
        textArea.setText("Preview Question Paper");
    }

    @javafx.fxml.FXML
    public void previewButton(ActionEvent actionEvent) {

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("ashif.txt")) ) {
            writer.write(textArea.getText());
            writer.newLine();

        } catch ( IOException e ) {
            System.out.println("Write Failed");
        }

        display.setText("Preview generated!");


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