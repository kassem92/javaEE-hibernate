package org.test1;

import Entities.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utils.HibernateUtils;

public class ReadSong {
    public static void main(String[] args) {

        SessionFactory sf = HibernateUtils.getSessionFactory();

        if(sf == null) {
            System.out.println("SessionFactory is empty !");
            return;
        }
        Session session = sf.openSession();
//        session.beginTransaction();
        Song s= session.load(Song.class,4);
//        session.getTransaction().commit();
        System.out.println("tostring " + s.getSongName());
    }
}