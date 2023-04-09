package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.test1.Song;

public class SessionFactoryUtil {

    public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
