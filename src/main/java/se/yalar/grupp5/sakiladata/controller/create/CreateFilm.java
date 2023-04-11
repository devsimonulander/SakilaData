package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.FilmHandler;
import se.yalar.grupp5.sakiladata.entities.Film;

public class CreateFilm {
    @FXML
    private TextField tfFilmId, tfTitle, tfDescription, tfReleaseYear, tfLanguageId, tfOriginalLanguageId, tfRentalDuration, tfRentalRate, tfLength,
            tfReplacementCost, tfRating, tfSpecialFeatures;

    @FXML
    public void create(){
        Film film = new Film();
        film.setFilmId(Integer.parseInt(tfFilmId.getText()));
        FilmHandler filmHandler = new FilmHandler();
        filmHandler.insert(film);
    }
}
