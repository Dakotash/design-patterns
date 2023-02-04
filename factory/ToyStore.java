package factory;

public abstract class ToyStore {
	
	public String orderPuzzle(String type) {
	Puzzle createdPuzzle = createPuzzle(type);
	return createdPuzzle.assemble();
	}
	
	public abstract Puzzle createPuzzle(String type); 
		
	
		
	

}
