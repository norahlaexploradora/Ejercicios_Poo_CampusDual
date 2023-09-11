module com.campusdual.ejerciciospoo_campusdual {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.campusdual.ejerciciospoo_campusdual to javafx.fxml;
    exports com.campusdual.ejerciciospoo_campusdual;
}