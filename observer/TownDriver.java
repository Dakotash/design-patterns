
	package observer;

	/**
	 * This is the driver class that to display the output
	 * @author Hawkins
	 *
	 */
	public class TownDriver {
		public static void main(String[] args) {
			System.out.println("A Happy Little City");

			/**
			 * Creates objects for each observer
			 */
			Watchman watchman = new Watchman();
			Observer fredrick = new ShopOwner(watchman);
			Observer lillian = new Teacher(watchman);
			Observer monte = new Knight(watchman);

			System.out.println("\n-----------------------\n");

			watchman.issueWarning(1);

			System.out.println("\n-----------------------\n");

			watchman.issueWarning(2);
		}
	}

	

