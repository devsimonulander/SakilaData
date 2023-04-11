package se.yalar.grupp5.sakiladata.controller.read;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import se.yalar.grupp5.sakiladata.StartMenu;

import java.io.IOException;

public class Read {
    @FXML
    private Button btnShowTable;
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
        String btninfo = StartMenu.lastBtn;
        try {
            switch (btninfo){
                case "Actor":
                    //Get by actor_id
                    break;
                case "Address":

                    break;
                case "City":

                    break;
                case "Customer":

                    break;
                case "Film":

                    break;
                case "FilmActor":

                    break;
                case "FilmCategory":

                    break;
                case "FilmText":

                    break;
                case "Inventory":

                    break;
                case "Payment":

                    break;
                case "Rental":

                    break;
                case "Staff":

                    break;
                case "Store":

                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
