package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.FilmHandler;
import se.yalar.grupp5.sakiladata.Handlers.InventoryHandler;
import se.yalar.grupp5.sakiladata.Handlers.StoreHandler;
import se.yalar.grupp5.sakiladata.entities.Film;
import se.yalar.grupp5.sakiladata.entities.Inventory;
import se.yalar.grupp5.sakiladata.entities.Store;

import java.util.ArrayList;
import java.util.List;

public class CreateInventory {
    @FXML
    private TextField tfInventoryId, tfFilmId, tfStoreId;

    void create() {
        Inventory inventory = new Inventory();

        // GUI needs to be fixed so that I add a list instead of an item:
        FilmHandler filmHandler = new FilmHandler();
        Film film = filmHandler.getById(Integer.parseInt(tfFilmId.getText()));
        List<Film> filmList = new ArrayList<Film>();
        filmList.add(film);
        inventory.setFilmList(filmList);

        // Same issue here:
        StoreHandler storeHandler = new StoreHandler();
        Store store = storeHandler.getStoreByID(Integer.parseInt(tfStoreId.getText()));
        List<Store> storeList = new ArrayList<Store>();
        storeList.add(store);
        inventory.setStoreList(storeList);

        InventoryHandler inventoryHandler = new InventoryHandler();
        inventoryHandler.insert(inventory);
    }
}
