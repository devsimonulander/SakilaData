package se.yalar.grupp5.sakiladata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import se.yalar.grupp5.sakiladata.entities.*;

import java.io.IOException;

public class StartMenu {
    public static String lastBtn;

    @FXML
    private Button btnActor, btnAddress, btnCategory, btnCity, btnCountry, btnCustomer, btnFilm, btnFilmActor,
            btnFilmCategory, btnFilmText, btnInventory, btnLanguage, btnPayment, btnRental, btnStaff, btnStore;
    @FXML
    void actorSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnActor.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnActor.setText("Actor");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();

    }
    @FXML
    void addressSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnAddress.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnAddress.setText("Address");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void categorySelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnCategory.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        System.out.println("Detta är en look-up tabell.");
    }
    @FXML
    void citySelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnCity.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnCity.setText("City");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void countrySelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnCountry.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        System.out.println("Detta är en look-up tabell.");
    }
    @FXML
    void customerSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnCustomer.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnCustomer.setText("Customer");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void filmSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnFilm.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnFilm.setText("Film");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void filmActorSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnFilmActor.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnFilmActor.setText("FilmActor");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void filmCategorySelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnFilmCategory.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnFilmCategory.setText("FilmCategory");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void filmTextSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnFilmText.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnFilmText.setText("FilmText");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void inventorySelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnInventory.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnInventory.setText("Inventory");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void languageSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnLanguage.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        System.out.println("Detta är en look-up tabell.");
    }
    @FXML
    void paymentSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnPayment.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnPayment.setText("Payment");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void rentalSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnRental.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnRental.setText("Rental");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void staffSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnStaff.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnStaff.setText("Staff");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }
    @FXML
    void storeSelected(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("crud-menu.fxml"));
        Stage window = (Stage) btnStore.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
        btnStore.setText("Store");
        Button clickedBtn = (Button) event.getSource();
        lastBtn = clickedBtn.getText();
    }

}
