package com.example.listviewsong;

public class Song {
    String songName;
    String singerName;
    String songImage;

    public Song(String songName, String singerName, String songImage) {
        this.songName = songName;
        this.singerName = singerName;
        this.songImage = songImage;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongImage() {
        return songImage;
    }

    public void setSongImage(String songImage) {
        this.songImage = songImage;
    }

    @Override
    public String toString() {
        return this.songName + "(Singer name: " + this.singerName + ")";
    }
}
