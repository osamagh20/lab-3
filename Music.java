import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;
    private List<Media> purchasedList;

    public Music(String title, String artist, String ISBN, double price) {
        super(title, artist, ISBN, price);
        this.artist = artist;
    }

    public void listen(User user) {
        purchasedList.add(null);
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {

        String artist = getAuteur();
        List<Music> playlist = new ArrayList<>();

        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(artist) && !music.getTitle().equals(getTitle())) {
                playlist.add(music);
            }
        }

        return playlist;
    }

    @Override
    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist;
    }
}