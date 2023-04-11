package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.ActorHandler;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.Handlers.AddressHandler;
import se.yalar.grupp5.sakiladata.entities.City;

public class CreateAddress {
    @FXML
    private TextField tfAddressId, tfAddress, tfAddress2, tfDistrict, tfCityId, tfPhone, tfPostalCode;

    @FXML
    void create(){
        Address address = new Address();
        address.setId(Integer.parseInt(tfAddressId.getText()));
        address.setAddress(tfAddress.getText());
        address.setAddress2(tfAddress2.getText());
        address.setDistrict(tfDistrict.getText());
        address.setCity(new City()); //TODO
        address.setPhoneNumber(Integer.parseInt(tfPhone.getText()));
        address.setPostalCode(Integer.parseInt(tfPostalCode.getText()));

        AddressHandler addressHandler = new AddressHandler();
        addressHandler.insert(address);
    }
}
