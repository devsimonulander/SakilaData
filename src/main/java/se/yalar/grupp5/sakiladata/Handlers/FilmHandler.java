package se.yalar.grupp5.sakiladata.Handlers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import se.yalar.grupp5.sakiladata.entities.Film;

public class FilmHandler {

    public Film getById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Film film = session.get(Film.class, id);

        return film;
    }

    public int insert(Film newFilm) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newFilm);

        session.getTransaction().commit();
        session.close();

        return newFilm.getId();
    }

    public void update(Film updateFilm) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Film film = session.get(Film.class, updateFilm.getId());
        film.setTitle(updateFilm.getTitle());
        film.setDescription(updateFilm.getDescription());
        film.setReleaseYear(updateFilm.getReleaseYear());
        film.setLanguage(updateFilm.getLanguage());
        film.setOriginalLanguage(updateFilm.getOriginalLanguage());
        film.setRentalDuration(updateFilm.getRentalDuration());
        film.setRentalRate(updateFilm.getRentalRate());
        film.setLength(updateFilm.getLength());
        film.setReplacementCost(updateFilm.getReplacementCost());
        film.setSpecialFeatures(updateFilm.getSpecialFeatures());
        session.update(film);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Film film = session.get(Film.class, id);

        session.delete(film);

        session.getTransaction().commit();
        session.close();
    }

    public Film select(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Film film = session.get(Film.class, id);

        return film;
    }

    public List<Film> selectAll() {
        List<Film> filmList = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        filmList = session.createQuery("SELECT f FROM Film f", Film.class).getResultList();

        session.getTransaction().commit();
        session.close();

        return filmList;
    }

}
