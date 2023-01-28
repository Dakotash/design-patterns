package Decorator;

/**
 * This is a child class representing the flavor of strawberry
 * @author Hawkins
 *
 */
public class Strawberry extends ScoopDecorator{
	
	public Strawberry(IceCream iceCream, int numScoops) {
		super(iceCream,numScoops);
		super.flavor = "strawberry";
		super.flavorCost = 1.4;
	}

}
