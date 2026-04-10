package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class updateProfileController {
    @javafx.fxml.FXML
    private Label display1;
    @javafx.fxml.FXML
    private TextField ageField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private Label display3;
    @javafx.fxml.FXML
    private Label display2;
    @javafx.fxml.FXML
    private Label display5;
    @javafx.fxml.FXML
    private Label display4;
    @javafx.fxml.FXML
    private TableColumn<Student,String> studentNameCol;
    @javafx.fxml.FXML
    private TableColumn<Student, Integer> ageCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> passwordCol;
    @javafx.fxml.FXML
    private TableView<Student> studentProfileTable;
    @javafx.fxml.FXML
    private Label updateSuccessfullLabel;

    List<Student> studentList =new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));

        studentList.add(new Student("Arnob",10,"A1234"));
        studentList.add(new Student("Ashraf",20,"B1234"));
        studentList.add(new Student("Asif",19,"D34567"));

        studentProfileTable.getItems().addAll(studentList);


    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        String nameInput = nameField.getText();
        int newAge = Integer.parseInt(ageField.getText());
        String newPassword = passwordField.getText();

        for(Student s : studentList){

            if(s.getStudentName().equals(nameInput)){

                s.setAge(newAge);
                s.setPassword(newPassword);

                studentProfileTable.refresh();

                updateSuccessfullLabel.setText("update Successfull");
            }
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) display1.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
