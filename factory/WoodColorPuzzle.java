package factory;
import java.util.ArrayList;

/**
 * This class data for the wood color puzzle
 * @author Hawkins
 *
 */
public class WoodColorPuzzle extends Puzzle {
	
	/**
	 * This is the constructor for the wood color puzzle 
	 */
	public WoodColorPuzzle() {
		super.name = "Animal Puzzle by Melissa and Doug";
		super.material = "wood";
		super.pieces = new ArrayList<String>(); 
		super.pieces.add("Red Fish"); 
		super.pieces.add("Yellow Fish");
		super.pieces.add("Green Fish");
		super.pieces.add("Purple Fish");
		super.pieces.add("Pink Fish");
		super.pieces.add("Orange Fish");
		super.pieces.add("Brown Fish");
		super.pieces.add("White Fish");
		super.pieces.add("Black Fish");
		
		
	}

}
