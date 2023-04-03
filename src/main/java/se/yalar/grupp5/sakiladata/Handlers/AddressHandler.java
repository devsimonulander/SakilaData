package Handlers;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Address;

public class AddressHandler {

    public  void getAddressById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Address addresses = session.get(Address.class, id);
        System.out.println("\n" + addresses.getCity() + ", " + addresses.getAddress() + "\n");
        System.out.println("\n" + addresses.getPostalCode() + "\n");

    }

    public int insertAddress(Address newAddress) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newAddress);

        session.getTransaction().commit();
        session.close();

        return newAddress.getId();
    }

    public int updateAddress(Address updateAddress) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Address address = session.get(Address.class, updateAddress.getId());
        address.setAddress(updateAddress.getAddress());
        address.setCity(updateAddress.getCity());
        address.setPhoneNumber(updateAddress.getPhoneNumber());
        address.setPostalCode(updateAddress.getPostalCode());
        session.update(address);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public int deleteAddress(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Address address = session.get(Address.class, id);

        session.delete(address);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    /* No need for this since we are using a gui.
    public int createNewAddress() {
        Scanner input1 = new Scanner(System.in);
        String input = "";
        Address address = new Address();

        System.out.println("Ange gatunamn");
        input = input1.nextLine();
        address.setStreet_name(input);

        System.out.println("Ange husnummer");
        input = input1.nextLine();
        address.setHouse_number(Integer.parseInt(input));

        System.out.println("Ange postnummer");
        input = input1.nextLine();
        address.setPostalCode(Integer.parseInt(input));

        System.out.println("Ange stad");
        input = input1.nextLine();
        address.setCity(input);

        return insertAdress(address);
    }*/

    public void deleteExistingAddress() {
        Scanner input1 = new Scanner(System.in);
        String input = "";
        Address adress = new Address();

        System.out.println("Ange ID för adressen du ska ta bort");
        input = input1.nextLine();

        deleteAddress(Integer.parseInt(input));

        System.out.println("Ny kund tillagd, med ID " + adress.getId());
    }

    /* No need for this since we are using a gui
    public void updateExistingAddress() {
        Scanner input1 = new Scanner(System.in);
        String input = "";
        Address adress = new Address();

        System.out.println("Ange ID för adress du ska uppdatera");
        input = input1.nextLine();
        adress.setAdress_id(Integer.parseInt(input));

        System.out.println("Ange ny gata");
        input = input1.nextLine();
        adress.setStreet_name(input);

        System.out.println("Ange nytt gatunummer");
        input = input1.nextLine();
        adress.setHouse_number(Integer.parseInt(input));

        System.out.println("Ange ny stad");
        input = input1.nextLine();
        adress.setCity(input);

        System.out.println("Ange nytt postnummer");
        input = input1.nextLine();
        adress.setPostalCode(Integer.parseInt(input));

        updateAdress(adress);

        System.out.println("Kund är nu uppdaterad!");
    }*/

    public void showAddress() {
        Scanner input1 = new Scanner(System.in);
        String input = "";

        System.out.println("Ange ID för adress du vill visa");
        input = input1.nextLine();

        getAddressById(Integer.parseInt(input));

    }
}