package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class viewRulesController
{
    @javafx.fxml.FXML
    private TextArea rulesTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        rulesTextArea.setText("Medical College Authority – Frequently Asked Questions (FAQ)\n" +
                "\n" +
                "1. What is the role of the Medical College Authority on this platform?\n" +
                "You are responsible for managing exam schedules, reviewing applications, overseeing exam integrity, and coordinating with invigilators and technical staff.\n" +
                "\n" +
                "2. How do I create or schedule an entrance exam?\n" +
                "Use the exam management panel to create a new exam session, define dates and times, upload question papers (if applicable), and assign invigilators.\n" +
                "\n" +
                "3. How can I assign invigilators to an exam?\n" +
                "Navigate to the invigilator management section, select an exam, and assign available invigilators based on availability and requirements.\n" +
                "\n" +
                "4. How do I monitor ongoing exams?\n" +
                "Use the monitoring dashboard to track candidate attendance, invigilator activity, and exam progress in real time.\n" +
                "\n" +
                "5. What should I do if there is a major technical issue during the exam?\n" +
                "Immediately inform the technical support team and, if necessary, pause or reschedule the exam following institutional policy.\n" +
                "\n" +
                "6. How do I handle reports of cheating or misconduct?\n" +
                "Review incident reports submitted by invigilators, check system logs if available, and take action according to institutional rules.\n" +
                "\n" +
                "7. Can I modify an exam after it has started?\n" +
                "In most cases, active exams cannot be modified. However, you may pause or terminate sessions if serious issues occur.\n" +
                "\n" +
                "8. How are results managed and published?\n" +
                "Once evaluation is complete, results can be verified and published through the result management section. Ensure accuracy before release.");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) rulesTextArea.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}