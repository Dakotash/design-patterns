package strategy;

import java.util.Random;

public class WeaponSword implements WeaponBehavior {

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
			return("Lunge and strike with sword");
		}
		else if (attackMeth == 1) {
			return("Fancy turn and slice with sword");
		}
		else 
			return("Jam opponents blade with sword");
		
	}

}
