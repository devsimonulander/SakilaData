package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "film_text")
public class FilmText implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public FilmText(){

    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FilmText{" +
                "film=" + film +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
