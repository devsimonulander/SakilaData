package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public Language(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
