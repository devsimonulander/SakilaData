package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film_category")
public class FilmCategory {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name="last_update")
    private String lastUpdate;

    public FilmCategory(){

    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "FilmCategory{" +
                "film=" + film +
                ", category=" + category +
                '}';
    }
}
