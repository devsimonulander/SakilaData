package se.yalar.grupp5.sakiladata;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button btnStart;

    @FXML
    void onStart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("start-menu.fxml"));
        Stage window = (Stage) btnStart.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}

