package se.yalar.grupp5.sakiladata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Read {
    @FXML
    private Button btnOk, btnShowTable;
    @FXML
    private TextField tfId;

    @FXML
    void showTable(ActionEvent event) throws IOException {
        Parent rootActor = FXMLLoader.load(getClass().getResource("readTable.fxml"));
        Stage windowActor = (Stage) btnShowTable.getScene().getWindow();
        windowActor.setScene(new Scene(rootActor, 750, 750));
    }
    @FXML
    void getId(ActionEvent event) throws IOException {

    }
}
