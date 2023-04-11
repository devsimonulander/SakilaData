package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Rental;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class RentalHandler {

    public List<Rental> getTable(){
        List<Rental> rentals = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try{
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Rental> criteria = builder.createQuery(Rental.class);
            Root<Rental> root = criteria.from(Rental.class);
            criteria.select(root);

            rentals = session.createQuery(criteria).getResultList();

        } catch (HibernateException e){
            e.printStackTrace();
        } finally{
            sessionFactory.close();
            session.close();
        }
        return rentals;
    }

    public Rental getById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Rental rental = session.get(Rental.class, id);
        session.close();
        sessionFactory.close();
        return rental;
    }

    public void insert(Rental rental){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(rental);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Rental newRental){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Rental rental = session.get(Rental.class, newRental.getRentalId());

        rental.setRentalDate(newRental.getRentalDate());
        rental.setInventoryId(newRental.getInventoryId());
        rental.setCustomerId(newRental.getCustomerId());
        rental.setReturnDate(newRental.getReturnDate());
        rental.setStaffId(newRental.getStaffId());

        session.update(rental);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Rental rental = session.get(Rental.class, id);

        session.delete(rental);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
