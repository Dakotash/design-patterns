package State_DesignPattern;

/**
 * This class represents a state of a package
 * By Cody
 */
public abstract class State{

    /**
     * Varaiables 
     */
    protected Package pkg;
    protected int quantity;

    /**
     * Constructor for State
     * @param pkg
     * @param quantity
     */
    public State(Package pkg, int quantity){
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    /**
     * This method reutns the correct verb depending on the quantity.
     * @param singular
     * @param plural
     * @return String singular or String plural
     */
    protected String getVerb(String singular, String plural){
        if( quantity == 1 )
        return singular;
        else
        return plural;
    }
    
}