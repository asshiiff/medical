package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AnalyzeQuestionDistributionController
{
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> typeCol;
    @javafx.fxml.FXML
    private TableView<QuestionSetter> questionDistributionTable;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> eventCol;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TableColumn<QuestionSetter,String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void actionButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}