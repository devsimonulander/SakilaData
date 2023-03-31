module com.example.sakiladata {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.sakiladata to javafx.fxml;
    exports com.example.sakiladata;
}