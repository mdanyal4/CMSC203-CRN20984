/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Bradley Beverage Shop)
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Mohammad Danyal
*/

/**
 * Represents a Coffee beverage.
 */
public class Coffee extends Beverage {
	
	private boolean addShot = true;
	private boolean addSyrup = true;
	private final double CHARGE_SHOT = 0.50;
	private final double CHARGE_SYRUP = 0.50;
	
	  /**
     * Creates a Coffee object using the given values.
     *
     * @param bevName beverage name
     * @param size beverage size
     * @param extraShot true if extra coffee shot added, false otherwise
     * @param extraSyrup true if extra syrup is added, false otherwise
     */
    public Coffee(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		
	super(bevName, TYPE.COFFEE, size);
	
	// Coffee coffeeObj = new Coffee(bevName, size, extraShot, extraSyrup);
	
	this.addShot = extraShot;
	this.addSyrup = extraSyrup;

    }

    /**
     * Indicates whether or not extra shot is added.
     *
     * @return true if extra shot is added, false otherwise
     */
    public boolean getExtraShot() {
	
	return addShot;
    }

    /**
     * Indicates whether or not extra syrup is added.
     *
     * @return true if extra syrup is added, false otherwise
     */
    public boolean getExtraSyrup() {
	
	return addSyrup;
    }

    /**
     * Calculates the price based on base price, size, extra coffee shot, and extra syrup.
     *
     * @return the price of the coffee
     */
    public double calcPrice() {
	
    	double price = 0;
    	
    	price += super.addSizePrice();
 
	if (addShot == true) {
		
		price += CHARGE_SHOT;
	}
	
    if (addSyrup == true) {
		
		price += CHARGE_SYRUP;
    }	
		
		return price;
	}
    
    /**
     * Checks if this Beverage equals to anotherBev.
     *
     * @param anotherBev the other Beverage object to compare
     * @return true if the name, type, size, base price, extra shot, and extra syrup are equal, false otherwise
     */
    public boolean equals(Object anotherBev) {
    	
    	Coffee coffee = (Coffee) anotherBev;
    	
    	if (super.equals(anotherBev)) {
    		
    		if (getExtraShot() == coffee.getExtraShot() && getExtraSyrup() == coffee.getExtraSyrup()) {
    			
    			return true;
    		}
    		
    	}
    	
    	return false;
    }
    
    /**
     * Represents a Coffee beverage in a specific String format: name, size, whether it contains extra shot, extra syrup, and the price.
     *
     * @return String representation of a Coffee
     */
    public String toString() {
    	
    	return super.getBevName() + "," + beverageSize + "," + addShot + "," + addSyrup + "," + calcPrice();
    }
    
}

