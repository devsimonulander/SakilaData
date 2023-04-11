package se.yalar.grupp5.sakiladata.controller.read;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import se.yalar.grupp5.sakiladata.StartMenu;
import se.yalar.grupp5.sakiladata.entities.Actor;

public class ReadTable {
    @FXML
    private TableView<Actor> table;
    @FXML
    private TableColumn<Actor, Integer> id;

    @FXML
    void read(){
        String btninfo = StartMenu.lastBtn;
        try {
            switch (btninfo){
                case "Actor":
                    TableColumn<Actor, Integer> actorId = new TableColumn<>("Actor Id");
                    actorId.setCellValueFactory(new PropertyValueFactory<>("id"));
                    TableColumn<Actor, String> actorName = new TableColumn<>("Actor name");
                    actorName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                    this.table.getColumns().addAll(new TableColumn[]{actorId, actorName});
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
