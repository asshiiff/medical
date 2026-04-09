package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CreateQuestionPaperController
{
    @javafx.fxml.FXML
    private TableView<QuestionSetter> quesstionPaperTable;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> totalScoreCol;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> marksCol;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> rankCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}