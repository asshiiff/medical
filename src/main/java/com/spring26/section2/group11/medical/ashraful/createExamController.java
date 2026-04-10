package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class createExamController
{
    @javafx.fxml.FXML
    private TextField totalMarksField;
    @javafx.fxml.FXML
    private TextArea examInstructionsTextArea;
    @javafx.fxml.FXML
    private TextField durationField;
    @javafx.fxml.FXML
    private TextField examNameField;
    @javafx.fxml.FXML
    private ComboBox<String> selectSubjectCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectSubjectCB.getItems().addAll("Immunology", "Toxicology", "Pharmacology");
    }

    @javafx.fxml.FXML
    public void saveExamFileButton(ActionEvent actionEvent) {
        String exam = selectSubjectCB.getValue();

        String examName = examNameField.getText();
        String duration = durationField.getText();
        String totalMarks = totalMarksField.getText();

        String examInstructions = examInstructionsTextArea.getText();

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("exam.txt")) ) {
            writer.write(examName);
            writer.newLine();
            writer.write(duration);
            writer.newLine();
            writer.write(totalMarks);
            writer.newLine();
            writer.write(exam);
            writer.newLine();
            writer.write(examInstructions);

        } catch ( IOException e ) {
            System.out.println("Write Failed");
        }


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) selectSubjectCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}