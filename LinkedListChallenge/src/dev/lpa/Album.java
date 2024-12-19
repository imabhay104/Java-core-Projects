package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name,String artist)
    {
        this.name=name;
        this.artist=artist;
    }
    public boolean addSong(String title,double time)
    {
        return songs.add(new Song( title,time))
    }

    public Song findSong(String title)
    {
        int index=songs.indexOf(title);
        return songs.get(index);
    }
    public boolean addToPlayList(int track_no, LinkedList<Song> songs)
    {
        if (songs.contains(track_no))

    }
}
