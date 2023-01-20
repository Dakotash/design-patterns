package observer;
/**
 * This class contains the ArrayList "observers" and implements form the Subject interface  
 * @arthur Cody Hawkins
 */
import java.util.ArrayList;

public class Watchman implements Subject {

	int warning;
	ArrayList <Observer> observers;
	
	/**
	 * Watchman constructor initializes the observers arraylist
	 */
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * This adds the observer to the arraylist
	 * @param the Observer object
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	
	/**
	 * This removes the observer from the arraylist
	 * @param the Observer object
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	
	/**
	 * This calls the observer's to display their warning.
	 */
	@Override
	public void notifyObservers() {
		for(int i =0; i<observers.size();i++) {
			observers.get(i).update(warning);
		}
		
	}
	
	/**
	 * This will display the warning message
	 * @param warning
	 */
	public void issueWarning(int warning) {
		if(warning == 1) {
			System.out.println("WARNING:  1 trumpet was played!");
		}
		else if(warning == 2) {
			System.out.println("WARNING:  2 trumpets were played!");
		}
		this.warning = warning;
		this.notifyObservers();
	}
	

}
