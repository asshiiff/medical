package com.spring26.section2.group11.medical.ashraful;

import com.spring26.section2.group11.medical.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class viewGuidelinesController
{
    @javafx.fxml.FXML
    private TextArea guidelinesTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        guidelinesTextArea.setText("Medical College Authority – Guidelines\n" +
                "\n" +
                "1. Plan and Schedule Carefully\n" +
                "Ensure that exam dates, times, and formats are clearly defined and communicated well in advance.\n" +
                "\n" +
                "2. Assign Roles Clearly\n" +
                "Assign invigilators and staff members ahead of time and make sure they understand their responsibilities.\n" +
                "\n" +
                "3. Maintain Transparency and Fairness\n" +
                "Ensure the examination process is fair, transparent, and compliant with institutional standards.\n" +
                "\n" +
                "4. Protect Sensitive Information\n" +
                "Do not share confidential materials such as exam questions, answer keys, or candidate data with unauthorized individuals.\n" +
                "\n" +
                "5. Monitor Exam Integrity\n" +
                "Actively oversee exam sessions and respond quickly to reports of suspicious activity or technical issues.\n" +
                "\n" +
                "6. Respond to Issues Promptly\n" +
                "Coordinate with technical support and invigilators to resolve problems during live exams without unnecessary delay.\n" +
                "\n" +
                "7. Document and Review Incidents\n" +
                "Ensure that any irregularities or incidents are documented, reviewed, and addressed appropriately.\n" +
                "\n" +
                "8. Follow Institutional Policies\n" +
                "Adhere strictly to academic regulations and policies when making decisions about misconduct, cancellations, or retakes.\n" +
                "\n" +
                "9. Ensure Proper Communication\n" +
                "Communicate clearly with candidates, invigilators, and support staff before, during, and after the exam.\n" +
                "\n" +
                "10. Review and Improve\n" +
                "After each exam, review the process, identify areas for improvement, and update procedures if necessary.");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group11/medical/ashraf/medicalCollegeAuthorityDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) guidelinesTextArea.getScene().getWindow();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}