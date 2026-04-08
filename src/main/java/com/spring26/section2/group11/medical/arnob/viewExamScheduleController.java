package com.spring26.section2.group11.medical.arnob;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class viewExamScheduleController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn examNameCol;
    @javafx.fxml.FXML
    private TableView examTable;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private TextArea detailsArea;

    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
    }
}
