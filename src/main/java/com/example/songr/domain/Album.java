package com.example.songr.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Album {
    @Id
    @GeneratedValue
    private int id ;
    private String title;
    private String artist;
    private int songCount;
    private int secondsLength ;
    private String imageUrl ;

    public Album(String title, String artist, int songCount, int secondsLength, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.secondsLength = secondsLength;
        this.imageUrl = imageUrl;
    }

    public Album() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setSecondsLength(int secondsLength) {
        this.secondsLength = secondsLength;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getSecondsLength() {
        return secondsLength;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
