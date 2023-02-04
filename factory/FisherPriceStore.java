package factory;

/**
 * Creates a fisher price store puzzle based off users choice
 * @author Hawkins
 *
 */
public class FisherPriceStore extends ToyStore{
	
	/**
	 * returns a object of what puzzle type is given by user
	 * @param String type
	 * @return a Puzzle object
	 */
	public Puzzle createPuzzle(String type) {
	if(type.equals("color")){
		return new PlasticColorPuzzle();
		}
	else if(type.equals("animal")){
		return new PlasticAnimalPuzzle();
		}
	else
		return null;
	}
}
