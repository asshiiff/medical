package com.spring26.section2.group11.medical.arnob;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ExamEvaluatorDashboardController {
    @javafx.fxml.FXML
    private Label ExamEvaluatorLabel;

    @javafx.fxml.FXML
    public void checkMarksandGiveMarksButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/ChecksAnswersAndGivesMarks.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void FinalResultSheetPublicationButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/finalResultSheetPublication.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ArchiveOldExamDataButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/archiveOldExamData.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void createRankingButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/EvalutorCreatesRanking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void studentPerformanceStatisticsButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentPerformanceStatistics.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/loginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void handleReEvalutionRequestButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/handleReEvaluationRequest.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void manageAnswerKeyButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/manageAnswerKey.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void studentContactButton(ActionEvent actionEvent)throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/arnob/studentContact.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExamEvaluatorLabel.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
