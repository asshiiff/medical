package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class EvalutorCreatesRankingController {
    @javafx.fxml.FXML
    private TableColumn studentNameCol;
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn marksCol;
    @javafx.fxml.FXML
    private TableColumn rankCol;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private TableView rankTable;
    @javafx.fxml.FXML
    private TableColumn studentIDCol;

    @javafx.fxml.FXML
    public void saveRankingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateRankingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportPDFButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ExamEvaluatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
