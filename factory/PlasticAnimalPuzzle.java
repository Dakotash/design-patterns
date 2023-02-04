package factory;
import java.util.ArrayList;

/**
 * This class data for the plastic animal puzzle
 * @author Hawkins
 *
 */
public class PlasticAnimalPuzzle extends Puzzle {
	
	/**
	 * This is the constructor for the plastic animal puzzle 
	 */
	public PlasticAnimalPuzzle() {
		super.name = "Animal Puzzle by Fisher Price";
		super.material = "plastic";
		super.pieces = new ArrayList<String>(); 
		super.pieces.add("Fox"); 
		super.pieces.add("Elephant");
		super.pieces.add("Giraffe");
		super.pieces.add("Owl");
		super.pieces.add("Monkey");
	
		
		
	}

}