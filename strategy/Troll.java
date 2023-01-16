package strategy;
public class Troll extends Character {
	
	/**
	 * This is a constructor for Troll
	 * @param name
	 */
	public Troll(String name) {
		super (name);
		super.setWeaponBehavior(new WeaponAxe());
		super.setWeaponBehavior(new WeaponNone());
		
	}
	
	public String toString() {
		
		return super.toString()+" is a funny troll\n"+new WeaponAxe().attack()+"\n"+new WeaponNone().attack();
		
	}


}
