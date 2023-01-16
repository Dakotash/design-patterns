package strategy;
/**
 * The parent class for medievel charcters in a game
 * @author Cody Hawkins
 * 
 */
public class Character implements WeaponBehavior{
	private String name;
	private WeaponBehavior weaponBehavior;
	
	/**
	 * Sets the charcters name
	 * @param name
	 * 
	 */
	public Character(String name) {
	this.name = name;
	}
	
	/**
	 * Sets the charcters attack method
	 * @returns string
	 * 
	 */
	public String attack() {
		return "";
	}
	
	/**
	 * sets characters weapon behavior
	 * @param wb
	 */
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
		
	}
	
	/**
	 * Creates a string to represent the character 
	 * @returns a string of the name
	 * 
	 */
	public String toString() {
		return name;
	}

}
