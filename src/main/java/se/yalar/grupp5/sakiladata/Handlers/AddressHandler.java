/*
package se.yalar.grupp5.sakiladata.Handlers;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.entities.City;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AddressHandler {

    public List<Address> getTable(){
        List<Address> addressList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Address> criteria = builder.createQuery(Address.class);
            Root<Address> root = criteria.from(Address.class);
            criteria.select(root);
            addressList = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return addressList;
    }

    public  Address getById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Address address = session.get(Address.class, id);
        session.close();
        return address;

    }

    public int insert(Address newAddress) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newAddress);

        session.getTransaction().commit();
        session.close();

        return newAddress.getId();
    }

    public int update(Address updateAddress) {

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

    public int delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Address address = session.get(Address.class, id);

        session.delete(address);

        session.getTransaction().commit();
        session.close();
        return 0;
    }


    public int create(String addressString, int postalCode, City city, String district, int phoneNumber) {
        Address address = new Address();

        address.setAddress(addressString);
        address.setCity(city);
        address.setDistrict(district);
        address.setPostalCode(postalCode);
        address.setPhoneNumber(phoneNumber);

        return insert(address);
    }

}*/
