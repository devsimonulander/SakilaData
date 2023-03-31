package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film_actor")
public class FilmActor {


    // säkerställ så att det är rätt gjort på nedan attribut
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @OneToMany(targetEntity = Film.class, mappedBy = "film_actor", cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private List<Film> filmList = new ArrayList<>();

    public FilmActor(){

    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    @Override
    public String toString() {
        return "FilmActor{" +
                "actor=" + actor +
                ", filmList=" + filmList +
                '}';
    }
}
