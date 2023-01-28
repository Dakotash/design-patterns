package Decorator;
/**
 * This is a child class representing the flavor of chocolate
 * @author Hawkins
 *
 */
public class Chocolate extends ScoopDecorator{
	
	public Chocolate(IceCream iceCream, int numScoops) {
		super(iceCream,numScoops);
		super.flavor = "chocolate";
		super.flavorCost = 1.5;
	}

}
