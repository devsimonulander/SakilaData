package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "store")
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "manager_staff_id")
    private int ManagerStaffId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name="last_update")
    private String lastUpdate;

    public Store(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManagerStaffId() {
        return ManagerStaffId;
    }

    public void setManagerStaffId(int managerStaffId) {
        ManagerStaffId = managerStaffId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", ManagerStaffId=" + ManagerStaffId +
                ", address=" + address +
                '}';
    }
}
