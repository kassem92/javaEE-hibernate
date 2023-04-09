package org.test1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Songs")
public class Song {
    @Id
    @GeneratedValue(generator = "generator")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "songName")
    private String songName;
    @Column (name = "songTitle")
    private String songTitle;
    public Song() {}
    public Song(String songName, String songTitle) {

        this.songName = songName;
        this.songTitle = songTitle;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setName(String songName) {
        this.songName = songName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String title) {
        this.songTitle = songTitle;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
