package iterator;
import java.util.Iterator;

/**
 * This class iterating aka looping through an album
 * @author Hawkins
 *
 */
public class AlbumIterator implements Iterator {
	
	/**
	 * Instance variables
	 */
	private Song[] song;
	private int position;
	
	
	/**
	 * Constructor for the class and sets the instance variables.
	 * @param song
	 */
	public AlbumIterator(Song[] song) {
		this.song = song;
		this.position =0;
	}

	/*
	 * returns true if their is more songs after current position in the song array
	 */
	@Override
	public boolean hasNext() {
	 return position < song.length && song[position] != null;
		
	}

	/**
	 * Returns the next song in the song array and moves the position up one index
	 */
	@Override
	public Song next() {
		if (hasNext() == true) {
			return song[position ++];
		}
		else 
			return null;
		
	}
 
}
