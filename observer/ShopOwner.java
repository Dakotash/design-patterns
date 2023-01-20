package observer;
/**
 * This is the class for Shop Owner that implements form the Observer interface
 * @author Cody Hawkins
 */
public class ShopOwner implements Observer{
	
	/**
	 * Instance variable for watchman
	 */
	Subject watchman;
	
	/**
	 * This is the constructor for the Shop owner
	 * @param subject watchman
	 */
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}

	/**
	 * This prints out what the shopowner does based on warning
	 * @param int warning
	 */
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Shop Owner: Close down shop and head home");
		}
		else if(warning == 2) {
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
		}
	}

}
