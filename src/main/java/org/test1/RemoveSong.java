package org.test1;

import Entities.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utils.HibernateUtils;

public class RemoveSong {
    public static void main(String[] args) {


        SessionFactory sf = HibernateUtils.getSessionFactory();

        if(sf == null) {
            System.out.println("SessionFactory is empty !");
            return;
        }

        Session session = sf.openSession();

        session.beginTransaction();

        Song s = session.load(Song.class,1);
        session.delete(s);

        session.getTransaction().commit();
    }
}