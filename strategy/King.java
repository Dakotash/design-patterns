package strategy;
public class King extends Character {
	
	/**
	 * This is a constructor for king
	 * @param name
	 * 
	 */
	public King(String name) {
		super (name);
		super.setWeaponBehavior(new WeaponSword());
	}
	
	public String toString() {
		
		return super.toString()+" is a Noble King\n"+new WeaponSword().attack();
		
	}
	
	

}
