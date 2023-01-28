package Decorator;

/**
 * Creates the cone and inherits from the ceCream 
 * @author Hawkins
 *
 */
public class Cone extends IceCream{
	
	/**
	 * This declares the conetype for this cone 
	 * returns coneType
	 */
	private ConeType coneType;
	
	/**
	 * This is the constructor for cone object
	 * @param ConeType which id the enum type passed into the constructor 
	 */
	public Cone(ConeType ConeType) {
		super();
		this.coneType = ConeType;
		String description = ConeType.name().replace("_"," ").toLowerCase();
		super.description = description.substring(0,1).toUpperCase() + description.substring(1) +", ";
	}

	/**
	 * This method gets the cost of the cone
	 * returns a double "price" 
	 */
	@Override
	public double getCost() {
		if(this.coneType == ConeType.SUGAR_CONE)
			return .75;
		else if(this.coneType == ConeType.WAFFLE_CONE)
			return 1.2;
		else if(this.coneType == ConeType.PRETZEL_CONE)
			return 1.8;
		else if(this.coneType == ConeType.CHOCOLATE_DIPPED_CONE)
			return 1.5;
		return 0;
	}

}
