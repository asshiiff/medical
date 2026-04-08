package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SaveQuestionBankController
{
    @javafx.fxml.FXML
    private ComboBox<String> subjectCB;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> questionCol;
    @javafx.fxml.FXML
    private ComboBox<String> difficultyCB;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableView<QuestionSetter> questionTable;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}