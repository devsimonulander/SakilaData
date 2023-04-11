package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Address;
import se.yalar.grupp5.sakiladata.entities.Category;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CategoryHandler {
    public List<Category> getTable(){
        List<Category> list = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Category> criteria = builder.createQuery(Category.class);
            Root<Category> root = criteria.from(Category.class);
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

    public  Category getById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Category category = session.get(Category.class, id);
        session.close();
        return category;

    }

    public int insert(Category newCategory) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newCategory);

        session.getTransaction().commit();
        session.close();

        return newCategory.getId();
    }

    public int update(Address updateCategory) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Address address = session.get(Address.class, updateCategory.getId());
        address.setAddress(updateCategory.getAddress());
        address.setCity(updateCategory.getCity());
        address.setPhoneNumber(updateCategory.getPhoneNumber());
        address.setPostalCode(updateCategory.getPostalCode());
        session.update(address);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Category category = session.get(Category.class, id);

        session.delete(category);

        session.getTransaction().commit();
        session.close();
    }


    public int create(String categoryName) {
        Category category = new Category();

        category.setName(categoryName);

        return insert(category);
    }

}

