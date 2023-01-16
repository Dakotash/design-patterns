package strategy;
import java.util.Random;

public class WeaponNone implements WeaponBehavior {

	/**
	 * This method randomly returns a attack 
	 * returns a string
	 * 
	 */
	@Override
	public String attack() {
		Random attackRan = new Random();
		int attackMeth = attackRan.nextInt(2);
		if(attackMeth == 0)
		{
			return("Oh no! I lost my weapon");
		}
		else 
			return("No one let's me have a weapon");
		
	}

}
