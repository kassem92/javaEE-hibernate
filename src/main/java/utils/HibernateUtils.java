package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Entities.Song;

public class HibernateUtils {

private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory(){

        try {
            if( sessionFactory== null) {

                Configuration configuration = new Configuration();
                configuration.configure("hibernate.cfg.xml");
                configuration.addAnnotatedClass(Song.class);
                sessionFactory = configuration.buildSessionFactory();

            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("failed to create session factory object !");

        }
            return sessionFactory;
    }
}
