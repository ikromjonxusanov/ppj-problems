class Song {
    private String singer;
    private String title;
    public Song(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
class Album {
    private String title;
    private Song[] songs;
    public Album(String title, Song[] songs) {
        this.title = title;
        this.songs = songs;
    }
    public Song[] getSongs() {
        return songs;
    }
    public String getTitle() {
        return title;
    }
}

class Shelf {
    private Album[] albums;
    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public String findAlbumBySong(String songTitle) {
        for (Album album : albums) {
            for (Song song : album.getSongs()) {
                if (song.getTitle().equals(songTitle)) {
                    return album.getTitle();
                }
            }
        }
        return null;
    }
}

public class ObjsII3She {
    public static void main (String[] args) {
        Album alb1 = new Album("Loving You",
                new Song[]{
                        new Song("Elvis","Party"),
                        new Song("Elvis","Hot Dog")
                });
        Album alb2 = new Album("Ella & Louis",
                new Song[]{
                        new Song("Armstrong","A Foggy Day"),
                        new Song("Fitzgerald","Cheek to Cheek")
                });
        Shelf shelf = new Shelf(
                new Album[]{alb1,alb2});
        System.out.println("Song from album: " +
                shelf.findAlbumBySong("Cheek to Cheek"));
    }
}
