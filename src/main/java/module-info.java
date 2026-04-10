module com.spring26.section2.group11.medical {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens com.spring26.section2.group11.medical to javafx.fxml;
    exports com.spring26.section2.group11.medical;
    exports com.spring26.section2.group11.medical.ashraful;
    opens com.spring26.section2.group11.medical.ashraful to javafx.fxml, java.base;
    opens com.spring26.section2.group11.medical.ashif to javafx.fxml;
    opens com.spring26.section2.group11.medical.arnob to javafx.fxml;
    exports com.spring26.section2.group11.medical.arnob;

}