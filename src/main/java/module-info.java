module com.example.sakiladata {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.persistence;


    opens se.yalar.grupp5.sakiladata to javafx.fxml;
    exports se.yalar.grupp5.sakiladata;
    exports se.yalar.grupp5.sakiladata.controller.read;
    opens se.yalar.grupp5.sakiladata.controller.read to javafx.fxml;
    exports se.yalar.grupp5.sakiladata.controller.create;
    opens se.yalar.grupp5.sakiladata.controller.create to javafx.fxml;
}