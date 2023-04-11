package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(name = "Join_filmID_storeID",
                joinColumns = {@JoinColumn(name = "film_id")},
                inverseJoinColumns = {@JoinColumn(name = "store_id")})
    private List<Film> filmList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Join_storeID_filmID",
                joinColumns = {@JoinColumn(name = "store_id")},
                inverseJoinColumns = {@JoinColumn(name = "filme_id")})
    private List<Store> storeList = new ArrayList<>();

    @Column(name="last_update")
    private String lastUpdate;

    public Inventory(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", filmList=" + filmList +
                ", storeList=" + storeList +
                '}';
    }
}
