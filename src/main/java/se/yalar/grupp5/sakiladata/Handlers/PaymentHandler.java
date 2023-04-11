package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Actor;
import se.yalar.grupp5.sakiladata.entities.Payment;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PaymentHandler {
    public List<Payment> getTable(){
        List<Payment> paymentList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Payment> criteria = builder.createQuery(Payment.class);
            Root<Payment> root = criteria.from(Payment.class);
            criteria.select(root);
            paymentList = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return paymentList;
    }
    public int insert(Payment newPayment) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(newPayment);

            session.getTransaction().commit();
            session.close();
        }

        return newPayment.getId();
    }

    public int update(Payment updatePayment) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Payment payment = session.get(Actor.class, updatePayment.getId());

        payment.setPaymentDate(updatePayment.getPaymentDate());
        payment.setAmount(updatePayment.getAmount());
        payment.setLastUpdate(updatePayment.getLastUpdate());
        payment.setCustomerId(updatePayment.getCustomerId());
        payment.setRentalId(updatePayment.getRentalId());
        payment.setStaffId(updatePayment.getStaffId());

        session.update(payment);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public int delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Payment payment = session.get(Payment.class, id);

        session.delete(payment);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public Payment getById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Payment payment = session.get(Payment.class, id);
        session.close();
        return payment;
    }
}
