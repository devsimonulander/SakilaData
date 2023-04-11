package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Inventory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class InventoryHandler {

    public List<Inventory> getTable(){
        List<Inventory> inventoryList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try{
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Inventory> criteriaQuery = criteriaBuilder.createQuery(Inventory.class);
            Root<Inventory> root = criteriaQuery.from(Inventory.class);
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

    public Inventory getInventoryById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Inventory inventory = session.get(Inventory.class, id);
        session.close();
        return inventory;
    }

    public void insert(Inventory inventory){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(inventory);

        session.getTransaction().commit();
        session.close();
    }


    public void update(Inventory newInventory){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Inventory oldInventory = session.get(Inventory.class, newInventory.getId());
        oldInventory.setFilmList(newInventory.getFilmList());
        oldInventory.setStoreList(newInventory.getStoreList());

        session.update(oldInventory);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Inventory inventory = session.get(Inventory.class, id);

        session.delete(inventory);
        session.getTransaction().commit();
        session.close();
    }
}
