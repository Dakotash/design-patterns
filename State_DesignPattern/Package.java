package State_DesignPattern;

/**
 * This class represents a package 
 * by Cody Hawkins
 */
public class Package {

    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Constructor for a Package
     * @param name
     * @param quantity
     */
    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new inTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);

    }
    /**
     * returning the message for the order
     * @return
     */
    public String order(){
        setState(orderedState);
        return orderedState.getStatus() + orderedState.getETA();
    }

    /**
     * returns the transit state
     * @return
     */
    public String mail(){
        setState(inTransitState);
        return inTransitState.getStatus() + inTransitState.getETA();
    }

    /**
     * returns the delivered state
     * @return
     */
    public String received(){
        setState(deliveredState);
        return deliveredState.getStatus();
    }

    /**
     * returns the delay message
     * @return
     */
    public String delay(){
        return state.delay();
    } 

    /**
     * Sets the state
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * sets the name
     * @return
     */
    public String getName(){
        return name;
    }
    
}
