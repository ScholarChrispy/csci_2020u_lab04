module com.registration.lab04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.registration.lab04 to javafx.fxml;
    exports com.registration.lab04;
}