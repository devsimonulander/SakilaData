package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.ActorHandler;
import se.yalar.grupp5.sakiladata.Handlers.CityHandler;
import se.yalar.grupp5.sakiladata.Handlers.CountryHandler;
import se.yalar.grupp5.sakiladata.entities.City;
import se.yalar.grupp5.sakiladata.entities.Country;

import java.sql.Timestamp;

public class CreateCity {
    @FXML
    private TextField tfCityId, tfCity, tfCountryId;

    void create() {
        City city = new City();

        CountryHandler countryHandler = new CountryHandler();
        Country country = countryHandler.getById(Integer.parseInt(tfCountryId.getText()));

        city.setCity(tfCity.getText());
        city.setCountry(country);

        CityHandler cityHandler = new CityHandler();
        cityHandler.insert(city);
    }
}
