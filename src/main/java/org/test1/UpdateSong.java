package org.test1;

import Entities.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class UpdateSong {

    public static void main(String[] args) {

        SessionFactory sf = HibernateUtils.getSessionFactory();

        if(sf == null) {
            System.out.println("SessionFactory is empty !");
            return;
        }
        Session session = sf.openSession();
        session.beginTransaction();
        Song song = session.load(Song.class,3);
        System.out.println("does the session managing the object song?  " +session.contains(song) );
        System.out.println("get song " + song.toString());
        song.setName("ja zo 444");
        song.setSongTitle("44");
        session.update(song);
        session.getTransaction().commit();
        System.out.println("tostring " + song.toString());
    }
}