package com.spring26.section2.group11.medical.ashif;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AssignInvigilatorsController
{
    @javafx.fxml.FXML
    private TableView<ExamController> invigilatorTable;
    @javafx.fxml.FXML
    private TableColumn<ExamController,String> invigilatorListCol;
    @javafx.fxml.FXML
    private Label display;
    @javafx.fxml.FXML
    private ComboBox<String> invigilatorCB;
    @javafx.fxml.FXML
    private TableColumn<ExamController,String> examCenterCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}