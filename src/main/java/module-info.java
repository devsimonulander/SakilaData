module com.example.sakiladata {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires org.locationtech.jts;


    opens se.yalar.grupp5.sakiladata to javafx.fxml;
    exports se.yalar.grupp5.sakiladata;
}