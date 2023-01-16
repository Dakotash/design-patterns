package strategy;
import java.util.Random;

public class WeaponBow implements WeaponBehavior {

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
			return("Draw and loose an arrow");
		}
		else
			return("Shoot arrow high in the sky");
		
	}


}
