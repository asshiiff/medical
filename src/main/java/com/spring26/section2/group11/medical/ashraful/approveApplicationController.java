package com.spring26.section2.group11.medical.ashraful;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class approveApplicationController
{
    @javafx.fxml.FXML
    private TableView<Applications> applicationsTable;
    @javafx.fxml.FXML
    private ComboBox<String> examsCB;
    @javafx.fxml.FXML
    private TableColumn<Applications, String> applicationsCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void approveApplicationsTabButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkApplicationsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewApplicationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}