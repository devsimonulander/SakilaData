package se.yalar.grupp5.sakiladata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CrudMenu {


    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnRead;

    @FXML
    private Button btnUpdate;

    @FXML
    void createSelected(ActionEvent event) throws IOException {
        String info = StartMenu.lastBtn;
        try {
            switch (info){
                case "Actor":
                    Parent rootActor = FXMLLoader.load(getClass().getResource("createActor.fxml"));
                    Stage windowActor = (Stage) btnCreate.getScene().getWindow();
                    windowActor.setScene(new Scene(rootActor, 600, 400));
                    break;
                case "Address":
                    Parent rootAddress = FXMLLoader.load(getClass().getResource("createAddress.fxml"));
                    Stage windowAddress = (Stage) btnCreate.getScene().getWindow();
                    windowAddress.setScene(new Scene(rootAddress, 600, 400));
                    break;
                case "City":
                    Parent rootCity = FXMLLoader.load(getClass().getResource("createCity.fxml"));
                    Stage windowCity = (Stage) btnCreate.getScene().getWindow();
                    windowCity.setScene(new Scene(rootCity, 600, 400));
                    break;
                case "Customer":
                    Parent rootCustomer = FXMLLoader.load(getClass().getResource("createCustomer.fxml"));
                    Stage windowCustomer = (Stage) btnCreate.getScene().getWindow();
                    windowCustomer.setScene(new Scene(rootCustomer, 600, 400));
                    break;
                case "Film":
                    Parent rootFilm = FXMLLoader.load(getClass().getResource("createFilm.fxml"));
                    Stage windowFilm = (Stage) btnCreate.getScene().getWindow();
                    windowFilm.setScene(new Scene(rootFilm, 600, 400));
                    break;
                case "FilmActor":
                    Parent rootFilmActor = FXMLLoader.load(getClass().getResource("createFilmActorFX.fxml"));
                    Stage windowFilmActor = (Stage) btnCreate.getScene().getWindow();
                    windowFilmActor.setScene(new Scene(rootFilmActor, 600, 400));
                    break;
                case "FilmCategory":
                    Parent rootFilmCategory = FXMLLoader.load(getClass().getResource("createFilmCategoryFX.fxml"));
                    Stage windowFilmCategory = (Stage) btnCreate.getScene().getWindow();
                    windowFilmCategory.setScene(new Scene(rootFilmCategory, 600, 400));
                    break;
                case "FilmText":
                    Parent rootFilmText = FXMLLoader.load(getClass().getResource("createFilmText.fxml"));
                    Stage windowFilmText = (Stage) btnCreate.getScene().getWindow();
                    windowFilmText.setScene(new Scene(rootFilmText, 600, 400));
                    break;
                case "Inventory":
                    Parent rootInventory = FXMLLoader.load(getClass().getResource("createInventory.fxml"));
                    Stage windowInventory = (Stage) btnCreate.getScene().getWindow();
                    windowInventory.setScene(new Scene(rootInventory, 600, 400));
                    break;
                case "Payment":
                    Parent rootPayment = FXMLLoader.load(getClass().getResource("createPayment.fxml"));
                    Stage windowPayment = (Stage) btnCreate.getScene().getWindow();
                    windowPayment.setScene(new Scene(rootPayment, 600, 400));
                    break;
                case "Rental":
                    Parent rootRental = FXMLLoader.load(getClass().getResource("createRental.fxml"));
                    Stage windowRental = (Stage) btnCreate.getScene().getWindow();
                    windowRental.setScene(new Scene(rootRental, 600, 400));
                    break;
                case "Staff":
                    Parent rootStaff = FXMLLoader.load(getClass().getResource("createStaff.fxml"));
                    Stage windowStaff = (Stage) btnCreate.getScene().getWindow();
                    windowStaff.setScene(new Scene(rootStaff, 600, 400));
                    break;
                case "Store":
                    Parent rootStore = FXMLLoader.load(getClass().getResource("createStore.fxml"));
                    Stage windowStore = (Stage) btnCreate.getScene().getWindow();
                    windowStore.setScene(new Scene(rootStore, 600, 400));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    @FXML
    void readSelected(ActionEvent event) throws IOException {
        String btninfo = StartMenu.lastBtn;
        try {
            switch (btninfo){
                case "Actor":
                    Parent rootActor = FXMLLoader.load(getClass().getResource("read.fxml"));
                    Stage windowActor = (Stage) btnRead.getScene().getWindow();
                    windowActor.setScene(new Scene(rootActor, 600, 400));
                    break;
                case "Address":
                    Parent rootAddress = FXMLLoader.load(getClass().getResource("read.fxml"));
                    Stage windowAddress = (Stage) btnRead.getScene().getWindow();
                    windowAddress.setScene(new Scene(rootAddress, 600, 400));
                    break;
                case "City":
                    Parent rootCity = FXMLLoader.load(getClass().getResource("createCity.fxml"));
                    Stage windowCity = (Stage) btnRead.getScene().getWindow();
                    windowCity.setScene(new Scene(rootCity, 600, 400));
                    break;
                case "Customer":
                    Parent rootCustomer = FXMLLoader.load(getClass().getResource("createCustomer.fxml"));
                    Stage windowCustomer = (Stage) btnRead.getScene().getWindow();
                    windowCustomer.setScene(new Scene(rootCustomer, 600, 400));
                    break;
                case "Film":
                    Parent rootFilm = FXMLLoader.load(getClass().getResource("createFilm.fxml"));
                    Stage windowFilm = (Stage) btnRead.getScene().getWindow();
                    windowFilm.setScene(new Scene(rootFilm, 600, 400));
                    break;
                case "FilmActor":
                    Parent rootFilmActor = FXMLLoader.load(getClass().getResource("createFilmActorFX.fxml"));
                    Stage windowFilmActor = (Stage) btnRead.getScene().getWindow();
                    windowFilmActor.setScene(new Scene(rootFilmActor, 600, 400));
                    break;
                case "FilmCategory":
                    Parent rootFilmCategory = FXMLLoader.load(getClass().getResource("createFilmCategoryFX.fxml"));
                    Stage windowFilmCategory = (Stage) btnRead.getScene().getWindow();
                    windowFilmCategory.setScene(new Scene(rootFilmCategory, 600, 400));
                    break;
                case "FilmText":
                    Parent rootFilmText = FXMLLoader.load(getClass().getResource("createFilmText.fxml"));
                    Stage windowFilmText = (Stage) btnRead.getScene().getWindow();
                    windowFilmText.setScene(new Scene(rootFilmText, 600, 400));
                    break;
                case "Inventory":
                    Parent rootInventory = FXMLLoader.load(getClass().getResource("createInventory.fxml"));
                    Stage windowInventory = (Stage) btnRead.getScene().getWindow();
                    windowInventory.setScene(new Scene(rootInventory, 600, 400));
                    break;
                case "Payment":
                    Parent rootPayment = FXMLLoader.load(getClass().getResource("createPayment.fxml"));
                    Stage windowPayment = (Stage) btnRead.getScene().getWindow();
                    windowPayment.setScene(new Scene(rootPayment, 600, 400));
                    break;
                case "Rental":
                    Parent rootRental = FXMLLoader.load(getClass().getResource("createRental.fxml"));
                    Stage windowRental = (Stage) btnRead.getScene().getWindow();
                    windowRental.setScene(new Scene(rootRental, 600, 400));
                    break;
                case "Staff":
                    Parent rootStaff = FXMLLoader.load(getClass().getResource("createStaff.fxml"));
                    Stage windowStaff = (Stage) btnRead.getScene().getWindow();
                    windowStaff.setScene(new Scene(rootStaff, 600, 400));
                    break;
                case "Store":
                    Parent rootStore = FXMLLoader.load(getClass().getResource("createStore.fxml"));
                    Stage windowStore = (Stage) btnRead.getScene().getWindow();
                    windowStore.setScene(new Scene(rootStore, 600, 400));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void updateSelected(ActionEvent event) throws IOException {

    }
    @FXML
    void deleteSelected(ActionEvent event) throws IOException {
        Parent rootStore = FXMLLoader.load(getClass().getResource("delete.fxml"));
        Stage windowStore = (Stage) btnRead.getScene().getWindow();
        windowStore.setScene(new Scene(rootStore, 600, 400));
    }
}
