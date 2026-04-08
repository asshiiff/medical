package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class EditQuestionPaperController
{
    @javafx.fxml.FXML
    private ComboBox<String> difficultyCB;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> questionListCol;
    @javafx.fxml.FXML
    private TableView<QuestionSetter> questionListTable;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void changeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}