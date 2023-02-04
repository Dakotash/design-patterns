package factory;
import java.util.ArrayList;

/**
 * This class data for the plastic color puzzle
 * @author Hawkins
 *
 */
public class PlasticColorPuzzle extends Puzzle {
	
	/**
	 * This is the constructor for the plastic animal puzzle 
	 */
	public PlasticColorPuzzle() {
		super.name = "Animal Puzzle by Fisher Price";
		super.material = "plastic";
		super.pieces = new ArrayList<String>(); 
		super.pieces.add("Green Dog"); 
		super.pieces.add("Orange Dog");
		super.pieces.add("Red Dog");
		super.pieces.add("Blue Dog");
		super.pieces.add("Yellow Dog");
		super.pieces.add("Brown Dog");
	
		
		
	}

}