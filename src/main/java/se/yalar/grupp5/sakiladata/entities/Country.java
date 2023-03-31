package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "country")
    private String country;

    public Country(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                '}';
    }
}
