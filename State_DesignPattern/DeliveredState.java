package State_DesignPattern;

/**
 * This class extends the State class and represents a state in which a package has been successfully delivered
 * By Cody Hawkins
 */
public class DeliveredState extends State {

    /**
     * constructor
     * @param pkg
     * @param quantity
     */
    public DeliveredState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    /**
     * Returns a string representing the status of the package in the delivered state
     * @return A string with the status of the package.
     */
    @Override
    public String getStatus() {
        return "The "+super.pkg.getName()+" "+ getVerb("is", "are")+" here for you\n";
    }

    /**
     * Returns a string indicating that the package has already been delivered
     * @return A string with the delivered status of the package
     */
    @Override
    public String getETA() {
        return "The "+super.pkg.getName()+" "+ getVerb("is", "are")+" here\n";
    }

    /**
     * Returns a string indicating that the package cannot be delayed as it has already been delivered
     * @return A string stating that the package has already been delivered.
     */
    @Override
    public String delay() {
        return "The "+super.pkg.getName()+" "+ getVerb("has", "have")+" already been delivered";
    }
    
}
