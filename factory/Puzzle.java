package factory;
import java.util.ArrayList;
/**
 * This puzzle class is abstract and gives the means to ouput what is being assemble
 * @author Hawkins
 *
 */
public abstract class Puzzle {
	
	/**
	 * instance variable for name
	 */
	protected String name;
	
	/**
	 * instance variable for material
	 */
	protected String material;
	
	/**
	 * A array list contains the string data for pieces
	 */
	protected ArrayList<String> pieces;
	//= new ArrayList<String>(); 
	
	/**
	 * This method returns the output of assemble of the puzzle. Used a for each loop to save each index of the pieces array list to the output
	 * @return String output
	 */
	public String assemble() {
		String output = "putting together a "+ name +" \n This puzzle is made out of "+ material +"\n Adding the following pieces ";
		
		for (String currentPiece: pieces) 
			output = output +"\n - "+currentPiece;
		return output + boxPuzzle();
		}
	
	/**
	 * Says what name is being put in a box
	 * @return String of the name being put in the box
	 */
	public String boxPuzzle() {
		return "\n Putting the "+ name + " in a box";
		
	}

}
