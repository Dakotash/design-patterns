package Decorator;
/**
 * This class manages the configuration of the iceCream class
 * @author Hawkins
 *
 */

public class ScoopDecorator extends IceCream{
	
	/**
	 * instance variable for "iceCream"
	 */
	protected IceCream iceCream;
	
	/**
	 * instance variable for "numScoops"
	 */
	protected int numScoops;
	
	/**
	 * instance variable for "flavor"
	 */
	protected String flavor;
	
	/**
	 * instance variable for "flavorCost"
	 */
	protected double flavorCost;
	
	/**
	 * Constructors 
	 * @param iceCream instance of iceCream class
	 * @param numScoops the number representing number of scoops for this iceCream
	 */
	public ScoopDecorator(IceCream iceCream, int numScoops) {
		super();
		this.iceCream = iceCream;
		this.numScoops = numScoops;
		
		
	}
	
	/**
	 * Prints out a string displaying the config of the iceCream 
	 * 
	 */
	public String toString() {
		if(numScoops > 1)
			return this.iceCream.toString() + numScoops +" scoops of " + flavor+" ice cream, ";
		else
			return this.iceCream.toString() + "A scoop of " + flavor +" ice cream, ";
	}

	
	/**
	 * sums up the cost of all the items that make up the iceCream
	 * returns a double representing the cost
	 */
	@Override
	public double getCost() {
		return (flavorCost * numScoops) + iceCream.getCost();
	}

}
