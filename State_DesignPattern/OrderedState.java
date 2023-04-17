package State_DesignPattern;

/**
 * This class extends the State class and represents a state in which a package is ordered.
 * by Cody Hawkins
 */
public class OrderedState extends State{

    private int days;

    /**
     * Constructor 
     * @param pkg
     * @param quantity
     */
    public OrderedState(Package pkg, int quantity){
        super(pkg, quantity);
        days = 2;
    }

    /**
     * Returns a string representing the status of the package in the ordered state.
     *  @return A string with the status of the package.
     */
    @Override
    public String getStatus() {
        return "The " +super.pkg.getName()+ " "+ getVerb("is", "are")+" ordered\n";  
    }

    /**
     * Returns a string representing the estimated time of arrival for the package.
     * @return A string with the ETA of the package.
     */
    @Override
    public String getETA() {
        return "The " +super.pkg.getName()+ " will be shipped within " +days+ " business days";
    }

    /**
     * Delays the shipment of the package by 2 business days and returns a string with the updated
     * @return A string with the updated ETA after the delay.
     */
    @Override
    public String delay() {
        days += 2;
        return "The " +super.pkg.getName()+ " experienced a slight delay in manufacturing.\nThe " +super.pkg.getName()+ " will be shipped within " +days+ " business days";
    }
    
}
