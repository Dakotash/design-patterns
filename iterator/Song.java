package iterator;

/**
 * This class represents the a song that will be held in the album class
 * @author Hawkins
 *
 */
public class Song {

	/**
	 * These are the instance variables which will be attributes for the Song Class
	 */
	private String Name;
	private String Artist;
	private double Length;
	private Genre Genre;
	
	/**
	 * Constructor for the song class
	 * @param name 
	 * @param artist 
	 * @param length
	 * @param genre
	 */
	public Song(String name, String artist, double length, Genre genre) {
		this.Name = name;
		this.Artist = artist;
		this.Length = length;
		this.Genre = genre;
	}
	
	/**
	 * This toString method prints out the instance variables for the song 
	 */
	public String toString(){
		return Name +" by "+ Artist +" category: "+ Genre + " length: "+ Length;
	}
}
