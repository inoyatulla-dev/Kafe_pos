module com.example.final4_11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final4_11 to javafx.fxml;
    exports com.example.final4_11;
}