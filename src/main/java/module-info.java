module com.example.f2021comp1011lhw10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f2021comp1011lhw10 to javafx.fxml;
    exports com.example.f2021comp1011lhw10;
}