package se.yalar.grupp5.sakiladata.Handlers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Customer;

public class CustomerHandler {

    public Customer getCustomerById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, id);

        return customer;
    }

    public void insert(Customer newCustomer) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newCustomer);

        session.getTransaction().commit();
        session.close();

//		return newCustomer.getId();
    }

    public void update(Customer updateCustomer) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Customer customer = session.get(Customer.class, updateCustomer.getId());
        customer.setFirstName(updateCustomer.getFirstName());
        customer.setLastName(updateCustomer.getLastName());
        customer.setEmail(updateCustomer.getEmail());
        customer.setAddress(updateCustomer.getAddress());
        session.update(customer);

        session.getTransaction().commit();
        session.close();
//		return 0;
    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Customer customer = session.get(Customer.class, id);

        session.delete(customer);

        session.getTransaction().commit();
        session.close();
//		return 0;
    }

    public Customer select(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, id);

        return customer;
    }

    public ArrayList<Customer> selectAll() {
        // TODO Auto-generated method stub

        return null;
    }

}
