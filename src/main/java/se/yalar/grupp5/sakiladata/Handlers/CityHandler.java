package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.City;
import se.yalar.grupp5.sakiladata.entities.Country;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CityHandler {
    public List<City> getTable(){
        List<City> list = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<City> criteria = builder.createQuery(City.class);
            Root<City> root = criteria.from(City.class);
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

    public  City getById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        City city = session.get(City.class, id);
        session.close();
        return city;

    }

    public int insert(City newCity) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newCity);

        session.getTransaction().commit();
        session.close();

        return newCity.getId();
    }

    public int update(City updateCity) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        City City = session.get(City.class, updateCity.getId());

        City.setCity(updateCity.getCity());
        City.setCountry(updateCity.getCountry());

        session.update(City);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        City City = session.get(City.class, id);

        session.delete(City);

        session.getTransaction().commit();
        session.close();
    }


    public int create(String cityName, Country country) {
        City city = new City();

        city.setCity(cityName);
        city.setCountry(country);

        return insert(city);
    }
}
