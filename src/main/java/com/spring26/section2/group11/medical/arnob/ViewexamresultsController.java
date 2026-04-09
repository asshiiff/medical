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

public class ViewexamresultsController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> marksCol;
    @javafx.fxml.FXML
    private TableColumn<Student,String> rankCol;
    @javafx.fxml.FXML
    private TableColumn<Student,String> subjectCol;
    @javafx.fxml.FXML
    private TableView<Student> viewResultTable;
    @javafx.fxml.FXML
    private TableColumn<Student,Integer> totalCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewResultButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void downloadPdfButton(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void backtButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
