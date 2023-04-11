package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.AddressHandler;
import se.yalar.grupp5.sakiladata.Handlers.StaffHandler;
import se.yalar.grupp5.sakiladata.Handlers.StoreHandler;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.entities.Staff;
import se.yalar.grupp5.sakiladata.entities.Store;

public class CreateStore {
    @FXML
    private TextField tfStoreId, tfManagerStaffId, tfAddressId;

    void create(){
        Store store = new Store();
        StoreHandler storeHandler = new StoreHandler();

        //StaffHandler staffHandler = new StaffHandler();
        // Staff manager = staffHandler.getById(Integer.parseInt(tfManagerStaffId.getText()));
        store.setManagerStaffId(Integer.parseInt(tfManagerStaffId.getText())); // Inte säker på att detta är vad vi ska göra.

        AddressHandler addressHandler = new AddressHandler()
        Address address = addressHandler.getById(Integer.parseInt(tfAddressId.getText()));
        store.setAddress(address);

        storeHandler.insert(store);
    }
}
