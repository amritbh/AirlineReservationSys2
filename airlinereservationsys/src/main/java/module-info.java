module com.mpp.airlinereservationsys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mpp.airlinereservationsys to javafx.fxml;
    exports com.mpp.airlinereservationsys;
}