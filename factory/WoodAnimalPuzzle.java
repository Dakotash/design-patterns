package factory;
import java.util.ArrayList;

/**
 * This class data for the wood animal puzzle
 * @author Hawkins
 *
 */
public class WoodAnimalPuzzle extends Puzzle {
	
	/**
	 * This is the constructor for the wood animal puzzle 
	 */
	public WoodAnimalPuzzle() {
		super.name = "Animal Puzzle by Melissa and Doug";
		super.material = "wood";
		super.pieces = new ArrayList<String>(); 
		super.pieces.add("Horse"); 
		super.pieces.add("Sheep");
		super.pieces.add("Dog");
		super.pieces.add("Cat");
		super.pieces.add("Cow");
		super.pieces.add("Chicken");
		
		
	}

}
