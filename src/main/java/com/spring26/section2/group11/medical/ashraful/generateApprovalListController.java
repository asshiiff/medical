package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class generateApprovalListController
{
    @javafx.fxml.FXML
    private TableView<Candidate> applicationsTable;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> applicationsListCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadListButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) applicationsTable.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}