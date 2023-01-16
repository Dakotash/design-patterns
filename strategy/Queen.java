package strategy;
public class Queen extends Character {
	
	/**
	 * This is a constructor for Queen
	 * @param name
	 */
	public Queen(String name) {
		super (name);
		super.setWeaponBehavior(new WeaponKnife());
		
	}
	
	public String toString() {
		
		return super.toString()+" is a is a beautiful queen\n"+new WeaponKnife().attack();
		
	}

}
