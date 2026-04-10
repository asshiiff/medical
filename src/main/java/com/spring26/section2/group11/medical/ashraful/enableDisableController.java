package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class enableDisableController
{
    @javafx.fxml.FXML
    private CheckBox physiologyCB;
    @javafx.fxml.FXML
    private CheckBox pharmacologyCB;
    @javafx.fxml.FXML
    private CheckBox microbiologyCB;
    @javafx.fxml.FXML
    private CheckBox pathologyCB;
    @javafx.fxml.FXML
    private CheckBox anatomyCB;
    @javafx.fxml.FXML
    private CheckBox toxicologyCB;
    @javafx.fxml.FXML
    private CheckBox biochemistryCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) physiologyCB.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}