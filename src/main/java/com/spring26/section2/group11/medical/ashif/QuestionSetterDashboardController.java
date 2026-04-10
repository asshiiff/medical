package com.spring26.section2.group11.medical.ashif;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class QuestionSetterDashboardController
{
    @javafx.fxml.FXML
    private Label questionSetterDashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {

        questionSetterDashboardLabel.setText("Welcome to Question Setter Dashboard");


        String username = "Ashif";
        questionSetterDashboardLabel.setText("Welcome, " + username);



    }

    @javafx.fxml.FXML
    public void submitQuestionPaperButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/submitQuestionPaper.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void createQuestionPaperButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/questionPaper.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void analyzeQuestionDistributionButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/analyzeQuestionDistribution.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }



    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/com/spring26/section2/group11/medical/login.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();


    }




    @javafx.fxml.FXML
    public void previewQuestionPaperButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/previewQuestionPaper.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void editQuestionPaperButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/editQuestionPaper.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void deleteQuestionButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/deleteQuestion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveQuestionBankButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/saveQuestionBank.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void categorizeQuestionButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashif/categorizeQuestion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) questionSetterDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}