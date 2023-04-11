package se.yalar.grupp5.sakiladata.entities;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="language_id")
    private int languageId;

    @Column(name = "name")
    private String name;

    @Column(name="last_update")
    private String lastUpdate;

    public Language(){

    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int id) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                '}';
    }
}
