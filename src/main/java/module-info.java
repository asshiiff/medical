module com.spring26.section2.group11.medical {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group11.medical to javafx.fxml;
    exports com.spring26.section2.group11.medical;
    exports com.spring26.section2.group11.medical.ashraful;
    opens com.spring26.section2.group11.medical.ashraful to javafx.fxml;
}