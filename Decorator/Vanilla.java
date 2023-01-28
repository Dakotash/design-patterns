package Decorator;
/**
 * This is a child class representing the flavor of vanilla
 * @author Hawkins
 *
 */
public class Vanilla extends ScoopDecorator{
	
	public Vanilla(IceCream iceCream, int numScoops) {
		super(iceCream,numScoops);
		super.flavor = "vanilla";
		super.flavorCost = 1.25;
	}

}
