package se.yalar.grupp5.sakiladata.entities;


import javax.persistence.*;
import org.hibernate.mapping.Set;

import java.io.Serializable;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="film_id")
    private int filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private int releaseYear;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_id")
    private Language language;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate")
    private double rentalRate;

    @Column(name = "length")
    private int length;

    @Column(name = "replacement_cost")
    private double replacementCost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "special_features")
    private Set specialFeatures;

    @Column(name="last_update")
    private String lastUpdate;

    public Film() {
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Set getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Set specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", language=" + language +
                ", originalLanguage=" + originalLanguage +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating=" + rating +
                ", specialFeatures=" + specialFeatures +
                '}';
    }
    enum Rating {
        G,
        PG,
        PG13,
        R,
        NC17
    }
}
