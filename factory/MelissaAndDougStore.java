package factory;

/**
 * Creates a Mel&Doug puzzle based off users choice
 * @author Hawkins
 *
 */
public class MelissaAndDougStore extends ToyStore{
	
	/**
	 * returns a object of what puzzle type is given by user
	 * @param String type
	 * @return a Puzzle object
	 */
	public Puzzle createPuzzle(String type) {
	if(type.equals("color")){
		return new WoodColorPuzzle();
		}
	else if(type.equals("animal")){
		return new WoodAnimalPuzzle();
		}
	else
		return null;
	}
}
