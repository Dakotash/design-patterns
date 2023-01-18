package strategy;
public class Knight extends Character {
	
	/**
	 * This is a constructor for the knight
	 * @param name
	 */
	public Knight(String name) {
		super (name);
		super.setWeaponBehavior(new WeaponBow());
		
	}
	
	public String toString() {
		
		return super.toString()+" is a valiant knight\n"+new WeaponBow().attack();
		
	}


}
