package se.yalar.grupp5.sakiladata.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public City(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country=" + country +
                '}';
    }
}
