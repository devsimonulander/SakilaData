package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the film_actor database table.
 */
@Entity
@Table(name = "film_actor")
@NamedQuery(name = "FilmActor.findAll", query = "SELECT f FROM FilmActor f")
public class FilmActor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FilmActorPK id;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    public FilmActor() {
    }

    public FilmActorPK getId() {
        return this.id;
    }

    public void setId(FilmActorPK id) {
        this.id = id;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}