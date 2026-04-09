package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    }

    @javafx.fxml.FXML
    public void saveExamFileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}