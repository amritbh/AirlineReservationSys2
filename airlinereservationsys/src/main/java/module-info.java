module com.mpp.airlinereservationsys {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.mpp.airlinereservationsys to javafx.fxml;
    exports com.mpp.airlinereservationsys;
}