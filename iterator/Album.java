package iterator;
/**
 * This class is creating an album
 * @author Hawkins
 *
 */
public class Album {
	
	/**
	 * Instance variables 
	 */
	private Song[] songs;
	private int count;
	private String name;
	
	/**
	 * The constructor for the album with the default values for the size of the song array and count 
	 * @param String name
	 */
	public Album(String name) {	
		songs = new Song[20];
		count = 0;
		this.name = name;
	}
	
	/**
	 * adding the song to the songs array
	 * @param name
	 * @param artist
	 * @param length
	 * @param genre
	 * @return
	 */
	public boolean addSong(String name, String artist,double length, Genre genre) {
		Song addSong = new Song(name, artist, length, genre);
		if(count < 20) {
			songs[count] = addSong;
			count++;
			return true;
		}
		return false;
	}
	
	/**
	 * creates AlbumIterator object and implements it from the AlbumIterator class
	 * @return AlbumIterator
	 */
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
	
	/**
	 * Prints out the name 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
			
}
