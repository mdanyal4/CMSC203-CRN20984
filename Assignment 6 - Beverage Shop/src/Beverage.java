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
 * Represents a Beverage Object.
 */
public abstract class Beverage {

	String beverageName = " ";
	TYPE beverageType;
	SIZE beverageSize;
	final double BASE_PRICE = 2.0;
	final double SIZE_UP = 1.0;
	
	   /**
     * Creates a beverage object using given values.
     *
     * @param bevName beverage name
     * @param type beverage type
     * @param size beverage size
     */
	Beverage(String bevName, TYPE type, SIZE size) {
		
		this.beverageName = bevName;
		this.beverageType = type;
		this.beverageSize = size;
		
	}
	
	/**
     * Calculates a new price by adding the size price to the base price.
     * There is no additional cost for a small size. For medium and large beverages,
     * the additional cost of size price is added to the base price.
     *
     * @return A new price that by adding the size price to the base price
     */
	public double addSizePrice() { // Calculates new String by adding the size price to the base price
		
		if (beverageSize == SIZE.MEDIUM) {
			
			return BASE_PRICE + SIZE_UP;
		}
		
		if (beverageSize == SIZE.LARGE) {
			
			return BASE_PRICE + (SIZE_UP * 2);
		}
		
		else {
			
		return BASE_PRICE;
		
		}
		
	}
	
	 /**
     * Calculates the beverage price.
     *
     * @return the beverage price
     */
	public abstract double calcPrice(); // Calculates the beverage price
	
	/**
     * Checks if this Beverage equals anotherBev.
     *
     * @param anotherBev the other Beverage object to compare
     * @return true if the name, type, and size are equal, false otherwise
     */
	public boolean equals(Object anotherBev) { // Checks if this beverage equals another beverage
		
	Beverage bev = (Beverage)anotherBev;
	
	if ( (getBevName() == bev.getBevName()) && (getType() == bev.getType()) && (getSize() == bev.getSize())) {
		
		return true;	
	}
	
	else
		return false;
	}
	
	 /**
     * Gets the base price.
     *
     * @return the base price
     */
	public double getBasePrice() { // Gets the base price
		
		return BASE_PRICE;
	}
	
	/**
     * Gets the name of the beverage.
     *
     * @return the beverage name
     */
	public String getBevName() { // Gets beverage name
		
		return beverageName;
	}
	
	 /**
     * Gets the size of the beverage.
     *
     * @return the size of the beverage
     */
	public SIZE getSize() { // Gets beverage size
		
		return beverageSize;
	}
	
	 /**
     * Gets the beverage type.
     *
     * @return the type of beverage
     */
	public TYPE getType() { // Gets beverage type
		
		return beverageType;
	}
	
	 /**
     * Represents a Beverage object in String with the format of bevName,size.
     *
     * @return the String representation of beverage
     */
	public String toString() { // Represents a beverage object in String with the format of bevName & size
		
		return beverageName + "," + beverageSize; 
	}
	
}