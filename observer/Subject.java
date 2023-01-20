package observer;

public interface Subject {
	
	/**
	 * This will register an observer
	 * @param observer  
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * This removes an observer
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * This will notify an observe 
	 */
	public void notifyObservers();

}
