package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Country;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CountryHandler {
    public List<Country> getTable(){
        List<Country> list = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Country> criteria = builder.createQuery(Country.class);
            Root<Country> root = criteria.from(Country.class);
            criteria.select(root);
            list = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return list;
    }

    public  Country getById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, id);
        session.close();
        return country;

    }

    public int insert(Country newCountry) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newCountry);

        session.getTransaction().commit();
        session.close();

        return newCountry.getId();
    }

    public int update(Country updateCountry) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, updateCountry.getId());

        country.setCountry(updateCountry.getCountry());
        country.setLastUpdate(updateCountry.getLastUpdate());

        session.update(country);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Country country = session.get(Country.class, id);

        session.delete(country);

        session.getTransaction().commit();
        session.close();
    }


    public int create(String countryName, String lastUpdate) {
        Country country = new Country();

        country.setCountry(countryName);
        country.setLastUpdate(lastUpdate);

        return insert(country);
    }
}
