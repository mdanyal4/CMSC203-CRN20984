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
 * Represents an Alcohol Beverage.
 */
public class Alcohol extends Beverage {

	boolean weekend = true;
	private final double weekendPrice = 0.60;
	

    /**
     * Creates an Alcohol object using the given values.
     *
     * @param bevName beverage name
     * @param size beverage size
     * @param isWeekend true if the beverage is offered during the weekend, false otherwise
     */
	public Alcohol(String bevName, SIZE size, boolean isWeekend) {
		
		super(bevName, TYPE.ALCOHOL, size);
		
		this.weekend = isWeekend;
	}
	
	 /**
     * Calculates the price of the alcohol beverage.
     *
     * @return the price of an alcohol beverage
     */
	public double calcPrice() {
		
		double price = 0;	
		price += super.addSizePrice();
		
		if (weekend == true) {
			
			price += 0.60;
		}
		
		return price;
	}
	
	 /**
     * Checks if it's the weekend.
     *
     * @return true if the beverage is offered during the weekend, false otherwise
     */
	public boolean isWeekend() {
		
		return weekend;
	}
	
	 /**
     * Checks if this Alcohol beverage equals anotherBev.
     *
     * @param anotherBev the other Beverage object to compare
     * @return true if the name, type, size, base price, and weekend offering are equal, false otherwise
     */
	public boolean equals(Object anotherBev) {
	
		Alcohol alcohol = (Alcohol) anotherBev;
    	
    	if (super.equals(anotherBev)) {
    		
    		if (getBevName() == alcohol.getBevName() && getType() == alcohol.getType() && getSize() == alcohol.getSize() && getBasePrice() == alcohol.getBasePrice() && isWeekend() == alcohol.isWeekend()) {
    			
    			return true;
    		}
    		
    	}
    	
    	return false;
	}		
	
	 /**
     * String representation of an Alcohol beverage, including the name, size, whether or not the beverage is offered during the weekend, and the price.
     *
     * @return a string containing information about an alcohol beverage
     */
	public String toString() {
		
		return super.getBevName() + "," + beverageSize + "," + isWeekend() + "," + calcPrice();
	}
	
  }

