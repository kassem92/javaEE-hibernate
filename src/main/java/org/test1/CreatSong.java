package org.test1;

import Entities.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class CreatSong {

    public static void main(String[] args) {

        SessionFactory sf = HibernateUtils.getSessionFactory();

        if(sf == null) {
            System.out.println("SessionFactory is empty !");
            return;
        }
        Session session = sf.openSession();

        session.beginTransaction();
        Song s = new Song( "gggg", "sssdsds");
        session.save(s);
        session.getTransaction().commit();
        System.out.println("tostring " + s.toString());
    }
}