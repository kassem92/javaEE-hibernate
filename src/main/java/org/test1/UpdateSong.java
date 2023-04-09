package org.test1;

import Entities.Song;
import org.hibernate.Session;
import utils.HibernateUtils;

public class CreatSong {

    public static void main(String[] args) {
        HibernateUtils hibernateUtils = new HibernateUtils();
        Session session = hibernateUtils.getSessionFactory().openSession();

        session.beginTransaction();
        Song s = new Song( "aaaaa", "asd");
        session.save(s);
        session.getTransaction().commit();
        System.out.println("tostring " + s.toString());
    }
}