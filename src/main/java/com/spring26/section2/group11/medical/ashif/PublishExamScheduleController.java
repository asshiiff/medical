package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PublishExamScheduleController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private TableColumn<ExamController,String> examlistCol;
    @javafx.fxml.FXML
    private TableView<ExamController> examlistTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void publishButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}