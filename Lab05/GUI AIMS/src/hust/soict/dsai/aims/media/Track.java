package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() throws PlayerException {
    	if(this.getLength() > 0) {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());}
    	else {
    		throw new PlayerException("ERROR: DVD Length is non-positive!");
    	}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Track track = (Track) o;
        return length == track.length && title != null ? title.equals(track.title) : track.title == null;
    }

}
