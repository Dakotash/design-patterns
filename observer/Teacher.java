package observer;

public class Teacher implements Observer{
	
	/**
	 * Instance variable for watchman
	 */
	Subject watchman;
	
	/**
	 * This is the constructor for the Shop owner
	 * @param subject watchman
	 */
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}

	/**
	 * This prints out what the teacher does based on warning
	 * @param int warning
	 */
	@Override
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe");
		}
		else if(warning == 2) {
			System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}

}
