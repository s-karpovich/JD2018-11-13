package by.it.skarpovich.enterprise.lesson1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        filterTracks(createAlbums(3, 10, 2, 20), 17);
    }

    private static ArrayList<Album> createAlbums(int n, int m, int minLength, int maxLength) {
        ArrayList<Album> albumsList = new ArrayList<>();
        ArrayList<Track> trackList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                trackList.add(new Track("Track" + j, minLength, maxLength));
            }
            albumsList.add(new Album("Album" + i, trackList));
        }
        return albumsList;
    }

    private static void filterTracks(ArrayList<Album> albumsList, int minTrackLength) {
        ArrayList<Track> list = new ArrayList<>();
        Stream<Album> albumStream = albumsList.stream();
        albumStream
                .map((album) -> {
                    ArrayList<Track> albumTracksList = album.getTracks();
                    for (Track track : albumTracksList) {
                        if (track.getLength() > minTrackLength)
                            list.add(track);
                    }
                    return new Album(album.getName(), list);
                })
                .forEach(filtered -> {
                    ArrayList<Track> trackArrayList = filtered.getTracks();
                    for (Track track : trackArrayList) {
                        System.out.printf("<%s>-<%s>-<%d>%n", filtered.getName(), track.getName(), track.getLength());
                    }
                });
    }
}
