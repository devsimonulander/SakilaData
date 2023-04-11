package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Staff;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class StaffHandler {
    public List<Staff> getTable(){
        List<Staff> staffList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Staff> criteria = builder.createQuery(Staff.class);
            Root<Staff> root = criteria.from(Staff.class);
            criteria.select(root);
            staffList = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return staffList;
    }
    public int insert(Staff newStaff) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(newStaff);

            session.getTransaction().commit();
            session.close();
        }

        return newStaff.getStaffId();
    }

    public int update(Staff updateStaff) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Staff staff = session.get(Staff.class, updateStaff.getStaffId());

        staff.setAddress(updateStaff.getAddress());
        staff.setEmail(updateStaff.getEmail());
        staff.setFirstName(updateStaff.getFirstName());
        staff.setLastName(updateStaff.getLastName());
        staff.setActive(updateStaff.isActive());
        staff.setPassword(updateStaff.getPassword());
        staff.setStore(updateStaff.getStore());
        staff.setUserName(updateStaff.getUserName());
        staff.setLastUpdate(updateStaff.getLastUpdate());
        staff.setPicture(updateStaff.getPicture());

        session.update(staff);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public int delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Staff staff = session.get(Staff.class, id);

        session.delete(staff);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public Staff getById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Staff staff = session.get(Staff.class, id);
        session.close();
        return staff;
    }
}
