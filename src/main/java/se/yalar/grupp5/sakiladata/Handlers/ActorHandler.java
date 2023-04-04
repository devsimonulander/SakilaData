package se.yalar.grupp5.sakiladata.Handlers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Actor;
import se.yalar.grupp5.sakiladata.entities.Address;

public class ActorHandler {
    public int insertAddress(Actor newActor) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newActor);

        session.getTransaction().commit();
        session.close();

        return newActor.getId();
    }

    public int updateActor(Actor updateActor) {

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

    public int deleteActor(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Actor actor = session.get(Actor.class, id);

        session.delete(actor);

        session.getTransaction().commit();
        session.close();
        return 0;
    }

    public Actor getActorById(int id){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Actor actor = session.get(Actor.class, id);
        session.close();
        return actor;
    }
}
