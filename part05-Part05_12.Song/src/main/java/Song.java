
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals(Object compared) {
        if (this ==  compared) {
            return true;
        }
        if (compared instanceof Song) {
            return true;
        }
        Song anotherSong = (Song) compared;
        if (this.artist.equals(anotherSong.artist) && this.name.equals(anotherSong.name) && (this.durationInSeconds == anotherSong.durationInSeconds)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
