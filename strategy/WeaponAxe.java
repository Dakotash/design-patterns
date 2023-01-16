package strategy;
import java.util.Random;
public class WeaponAxe implements WeaponBehavior {

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
			return("Swing an axe");
		}
		else
			return("Twirl with an axe");
		
	}

}
