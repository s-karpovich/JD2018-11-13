package by.it.skarpovich.enterprise.lesson1;

import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Track> tracks;

    Album(String name, ArrayList<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
