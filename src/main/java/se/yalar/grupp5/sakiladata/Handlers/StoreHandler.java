package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Store;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class StoreHandler {

    public List<Store> getTable(){
        List<Store> inventoryList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try{
            CriteriaBuilder criteriaBuilder  = session.getCriteriaBuilder();
            CriteriaQuery<Store> criteriaQuery = criteriaBuilder.createQuery(Store.class);
            Root<Store> root = criteriaQuery.from(Store.class);
            criteriaQuery.select(root);
            inventoryList = session.createQuery(criteriaQuery).getResultList();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return inventoryList;
    }

    public Store getStoreByID (int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Store store = session.get(Store.class, id);
        session.close();

        return store;
    }

    public void insert(Store store){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.persist(store);

        session.getTransaction().commit();
        session.close();
        sf.close();

    }

    public void update(Store newStore){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Store store = session.get(Store.class, newStore.getId());
        store.setAddress(newStore.getAddress());
        store.setManagerStaffId(newStore.getManagerStaffId());

        session.update(store);
        session.beginTransaction().commit();

        session.close();
        sf.close();
    }

    public void delete(int id){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Store store = session.get(Store.class, id);

        session.delete(store);
        session.getTransaction().commit();

        session.close();
        sf.close();
    }
}
