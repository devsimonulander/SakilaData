package se.yalar.grupp5.sakiladata.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //kolla upp unika värden i mysql
    @Column(name = "manager_staff_id")
    private int ManagerStaffId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

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

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", ManagerStaffId=" + ManagerStaffId +
                ", address=" + address +
                '}';
    }
}
