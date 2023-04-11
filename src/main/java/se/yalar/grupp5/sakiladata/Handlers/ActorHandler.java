/*
package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Actor;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ActorHandler {

    public List<Actor> getTable(){
        List<Actor> actorList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Actor> criteria = builder.createQuery(Actor.class);
            Root<Actor> root = criteria.from(Actor.class);
            criteria.select(root);
            actorList = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return actorList;
    }
    public int insert(Actor newActor) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(newActor);

            session.getTransaction().commit();
            session.close();
        }

        return newActor.getId();
    }

    public int update(Actor updateActor) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Actor actor = session.get(Actor.class, updateActor.getId());
        actor.setFirstName(updateActor.getFirstName());
        actor.setLastName(updateActor.getLastName());
        session.update(actor);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public int delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Actor actor = session.get(Actor.class, id);

        session.delete(actor);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public Actor getById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Actor actor = session.get(Actor.class, id);
        session.close();
        return actor;
    }
}
*/
