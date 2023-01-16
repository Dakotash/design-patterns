package strategy;
import java.util.Random;

public class WeaponKnife implements WeaponBehavior {

	/**
	 * This method randomly returns a attack 
	 * returns a string
	 * 
	 */
	@Override
	public String attack() {
		Random attackRan = new Random();
		int attackMeth = attackRan.nextInt(3);
		if(attackMeth == 0)
		{
			return("Slice with knife");
		}
		else if (attackMeth == 1) {
			return("Jab with a knife");
		}
		else 
			return("Sneak up on opponent with knife");
		
	}


}
