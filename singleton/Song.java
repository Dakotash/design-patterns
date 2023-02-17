package singleton;
/**
 * Creates a song object 
 * @author Hawkins
 *
 */
public class Song {

	private String Title;
	private String Artist;
	
	/**
	 * The constructor for song
	 * @param String title
	 * @param String artist
	 */
	public Song(String title, String artist) {
		this.Title = title;
		this.Artist = artist;
	}
	
	//Accessors 
	public String getTitle(){
		return this.Title;
	}
	
	public String getArtist() {
		return this.Artist;
	}

	public String toString() {
		return Title + "|" + Artist;
	}
}
