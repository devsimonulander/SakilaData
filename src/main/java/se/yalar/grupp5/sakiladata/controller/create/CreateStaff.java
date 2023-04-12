package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.AddressHandler;
import se.yalar.grupp5.sakiladata.Handlers.StoreHandler;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.entities.Staff;
import se.yalar.grupp5.sakiladata.entities.Store;

public class CreateStaff {
    @FXML
    private TextField tfStaffId, tfFirstName, tfLastName, tfAddressId, tfEmail, tfStoreId, tfActive, tfUsername, tfPassword;

    void create() {
        Staff staff = new Staff();

        staff.setFirstName(tfFirstName.getText());
        staff.setLastName(tfLastName.getText());

        AddressHandler addressHandler = new AddressHandler();
        Address address = addressHandler.getById(Integer.parseInt(tfAddressId.getText()));
        staff.setAddress(address);

        staff.setEmail(tfEmail.getText());

        StoreHandler storeHandler = new StoreHandler();
        Store store = storeHandler.getStoreByID(Integer.parseInt(tfStoreId.getText()));
        staff.setStore(store);


        staff.setActive(Boolean.parseBoolean(tfActive.getText()));
        staff.setUserName(tfUsername.getText());
        staff.setPassword(tfPassword.getText());
    }
}
