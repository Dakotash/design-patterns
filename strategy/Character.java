package strategy;
public class Character implements WeaponBehavior{
	private String name;
	private WeaponBehavior weaponBehavior;
	
	public Character(String name) {
	this.name = name;
	}
	
	public String attack() {
		return "";
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
		
	}
	
	public String toString() {
		return name;
	}

}
