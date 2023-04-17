package State_DesignPattern;

/**
 * The InTransitState class represents a state in which a package is in transit or out for delivery and extends the State class
 * by Cody Hawkins
 */
public class inTransitState extends State{

    private int days;

    /**
     * Constructor
     * @param pkg
     * @param quantity
     */
    public inTransitState(Package pkg, int quantity){
        super(pkg, quantity);
        days = 5;
    }

    /**
     * Returns a string representing the status of the package in the in-transit state
     * @return A string with the status of the package
     */
    @Override
    public String getStatus() {
        return "The "+super.pkg.getName()+" "+ getVerb("is", "are")+" out for delivery\n";   
    }

    /**
     * Returns a string representing the estimated time of arrival for the package
     * @return A string with the ETA of the package
     */
    @Override
    public String getETA() {
        return "The "+super.pkg.getName()+" should arrive within "+days+" days";
    }

    /**
     * Delays the arrival of the package by 3 days and returns a string with the updated
     * @return A string with the updated ETA after the delay
     */
    @Override
    public String delay() {
        days += 3;
        return "The "+super.pkg.getName()+ " "+ getVerb("has", "have")+" experienced a delay in shipping.\nThe "+super.pkg.getName()+" should arrive within "+days+" days";  
    }
    
}
