package se.yalar.grupp5.sakiladata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import se.yalar.grupp5.sakiladata.entities.Actor;

import java.io.IOException;

public class Delete {
    Actor Actor = new Actor();
    @FXML
    private Button btnOk;
    @FXML
    private TextField tfId;
    @FXML
    void delete(ActionEvent event) throws IOException {
        String info = StartMenu.lastBtn;
        try {
            switch (info){
                case "Actor":

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
