module com.example.f2021comp1011lhw10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.net.http;

    opens com.example.f2021comp1011lhw10 to javafx.fxml, com.google.gson;
    exports com.example.f2021comp1011lhw10;
}