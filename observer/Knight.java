package observer;

/**
 * This is the class for knight that implements form the Observer interface
 * @author Cody Hawkins
 */
public class Knight implements Observer{
	
	/**
	 * Instance variable for watchman
	 */
	Subject watchman;
	
	/**
	 * This is the constructor for the Shop owner
	 * @param subject watchman
	 */
	public Knight(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}

	/**
	 * This prints out what the Knight does based on warning
	 * @param int warning
	 */
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Knight: Helps everyone get home safe");
		}
		else if(warning == 2) {
			System.out.println("Knight: Prepares for battle");
		}
	}

}
