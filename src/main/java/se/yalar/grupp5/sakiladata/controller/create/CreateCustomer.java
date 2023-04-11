package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.AddressHandler;
import se.yalar.grupp5.sakiladata.Handlers.CustomerHandler;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.entities.Customer;

public class CreateCustomer {
    @FXML
    private TextField tfFirstName, tfLastName, tfEmail, tfAktiv, tfCustomerId, tfStoreId, tfAddressId;

    void create() {
        Customer customer = new Customer();

        customer.setFirstName(tfFirstName.getText());
        customer.setLastName(tfLastName.getText());
        customer.setEmail(tfEmail.getText());
        customer.setActive(Boolean.parseBoolean(tfAktiv.getText())); //fel typ på fält
        //customer.setStores(); //wtf

        AddressHandler addressHandler = new AddressHandler();
        Address address = addressHandler.getById(Integer.parseInt(tfAddressId.getText()));
        customer.setAddress(address);

        CustomerHandler customerHandler = new CustomerHandler();
        customerHandler.insert(customer);
    }
}
