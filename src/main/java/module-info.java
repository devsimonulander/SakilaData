module com.example.sakiladata {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens se.yalar.grupp5.sakiladata to javafx.fxml;
    exports se.yalar.grupp5.sakiladata;
}