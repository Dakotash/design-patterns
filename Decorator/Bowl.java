package Decorator;

/**
 * This class represents the bowl 
 * @author Cody Hawkins
 *
 */
public class Bowl extends IceCream{

	/**
	 * default constructor for bowl
	 */
	public Bowl() {
		super();
		super.description = "Bowl, ";
	}

	/**
	 * This shows the price of the bowl
	 * returns cost
	 */
	@Override
	public double getCost() {
		return 0;
	}
}
