package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class viewFAQController
{
    @javafx.fxml.FXML
    private TextArea faqTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        faqTextArea.setText("Frequently Asked Questions (FAQ)\n" +
                "\n" +
                "1. What are my responsibilities as an invigilator?\n" +
                "As an invigilator, you are responsible for monitoring candidates during the exam, ensuring exam rules are followed, handling candidate queries, and reporting any irregularities or technical issues.\n" +
                "\n" +
                "2. How do I start monitoring an exam session?\n" +
                "Once assigned to an exam, log in to the system and open the active exam session. You will be able to view the list of candidates, monitor their status, and track their activity in real time.\n" +
                "\n" +
                "3. What should I do if a candidate faces technical issues?\n" +
                "Ask the candidate to stay calm and report the issue through the provided support channel. Note the issue in your invigilator dashboard and notify the technical support team if required.\n" +
                "\n" +
                "4. How do I report suspicious activity?\n" +
                "Use the “Report” or “Flag” option on the candidate’s profile or activity panel. Include a short description of the observed behavior so the admin team can review it.\n" +
                "\n" +
                "5. Can I communicate with candidates during the exam?\n" +
                "Yes, if the platform provides a chat or announcement feature. Keep communication professional and limited to exam-related issues.\n" +
                "\n" +
                "6. What should I do if a candidate is absent?\n" +
                "If a candidate does not join within the allowed entry time, mark them as absent or leave them unmarked according to the exam guidelines.\n" +
                "\n" +
                "7. How are violations handled?\n" +
                "Violations should be recorded in the system immediately. The examination authority will review flagged cases and decide on the appropriate action.\n" +
                "\n" +
                "8. Who do I contact for technical support?\n" +
                "If you face system issues or need urgent help, contact the platform’s technical support team through the support page or designated hotline.");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/invigilatorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) faqTextArea.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}