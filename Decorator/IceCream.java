package Decorator;

/**
 * This defines the iceCream object That will be used inside inherited classes 
 * @author Hawkins
 *
 */
abstract class IceCream {
	
	/**
	 * attribute for the description of ice cream 
	 */
	protected String description;
	
	/**
	 * This overloaded method returns icecream 
	 */
	@Override
	public String toString() {
		return description;
	}
	
	/**
	 * place holder for other classes to use the getCost method because it's abstract 
	 * @return a double which is the cost
	 */
	public abstract double getCost();

}
