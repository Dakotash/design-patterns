package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the class that holds for the jukebox
 * @author Hawkins
 *
 */
public class JukeBox {
	
//Comment for me: Theses top two are the variables from the uml diagram 
	
	
	/**
	 * The singleton of the jukebox controlling the access to the object.
	 */
	private static JukeBox jukeBox = null;
	
	/**
	 * declare songs Arraylist of type Song
	 */
	private ArrayList <Song> songs;

	/**
	 * declare the queue for request of the songs
	 */
	private Queue <String> songQueue;
	
	
//Comment for me: These are the methods from the uml diagram 
	
	
	/*
	 * Constructor for JukeBox initializing the arraylist and queue for the JukeBox
	 */
	private JukeBox() {
		songs = new ArrayList <Song>();
		songQueue = new LinkedList <String>();
		songs = DataLoader.getSongs();
	}
	
	/**
	 * initialize the jukebox object that we created in this that is private so we can control it
	 * @return jukeBox
	 */
	public static JukeBox getInstance() {
		if(jukeBox == null)
			jukeBox = new JukeBox();
		return jukeBox;
	}
	
	/**
	 * This method prints the song from the queue
	 * @return a string depending on if the queue is empty 
	 */
	public String playNextSong() {
		if(songQueue.size() > 0) {
			String song = songQueue.poll();
			String artist = "";
			for(Song s: songs) {
				if (s.getTitle().equals(song)) {
					artist = s.getArtist();
					break;
				}
			}
				
			return "Let's jam to " + song + " to " + artist; //Queue.poll Retrieves and removes the head of the queue  
		}
		else
			return " You need to add songs to the list.";
	}
	
	/**
	 * This method checks if the title of the song is in the arraylist and prints its location if it is
	 * @param title from the song class
	 * @returns a string based o if the title is in the array list.
	 */
	public String requestSong(String title) {
		for (Song nameOfSong: songs) {
			String [] songInfo = nameOfSong.toString().split("|");
			//System.out.println(songInfo.length + " - "  + title);
			if(nameOfSong.getTitle().equalsIgnoreCase(title)) {
				songQueue.add(title);
				return title + " is now number " + songQueue.size() + " on the list ";
			}
		}
				return "Sorry we do not have the song " + title;
	}
	
	/**
	 * This checks if there is more songs 
	 * @return true or false based on if there are songs in the queue
	 */
	public boolean hasMoreSongs() {
		if(songQueue.size() > 0) 
			return true;
		else
			return false;
		
	}
	
	
	
}
