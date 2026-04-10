package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class paymentHistoryController {

    @javafx.fxml.FXML
    private Label display1;

    @javafx.fxml.FXML
    private TableColumn<Student,Integer> amountCol;

    @javafx.fxml.FXML
    private TableColumn<Student,String> statusCol;

    @javafx.fxml.FXML
    private TableView<Student> paymentTable;

    @javafx.fxml.FXML
    private TableColumn<Student,Integer> studentIdCol;

    @javafx.fxml.FXML
    private Label display2;

    @javafx.fxml.FXML
    private Label successfullLabel;


    @javafx.fxml.FXML
    private Label amountLabel;

    List<Student> studentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        studentList.add(new Student(2221684,"Paid",1200));
        studentList.add(new Student(2010192,"Paid",3000));
        studentList.add(new Student(2230191,"Due",5000));

        paymentTable.getItems().addAll(studentList);
    }


    // show total due
    @javafx.fxml.FXML
    public void payButton(ActionEvent actionEvent) {

        int totalDue = 0;

        for(Student s : paymentTable.getItems()){

            if(s.getStatus().equalsIgnoreCase("Due")){
                totalDue += s.getAmount();
            }
        }

        amountLabel.setText("Due = " + totalDue);
    }


    @javafx.fxml.FXML
    public void payNowButton(ActionEvent actionEvent) {

        for(Student s : paymentTable.getItems()){

            if(s.getStatus().equalsIgnoreCase("Due")){
                s.setStatus("Paid");
            }
        }

        paymentTable.refresh();

        successfullLabel.setText("Payment Successful");


        amountLabel.setText("");
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

