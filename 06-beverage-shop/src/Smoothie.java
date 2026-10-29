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
 * Represents a Smoothie Beverage.
 */
public class Smoothie extends Beverage {

	int numFruits = 0;
	boolean proteinPowder = true;
	private final double EXTRA_FRUIT = 0.50;
	private final double EXTRA_PROTEIN = 1.50;
	
	 /**
     * Creates a Smoothie object using the given values.
     *
     * @param bevName beverage name
     * @param size beverage size
     * @param numOfFruits number of fruits to be added to the smoothie
     * @param addProtein whether to add protein to the smoothie or not
     */
	public Smoothie(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		
		super(bevName, TYPE.SMOOTHIE, size);
		
		this.proteinPowder = addProtein;
		this.numFruits = numOfFruits;
		
	}
	
	 /**
     * Returns the number of fruits.
     *
     * @return number of fruits
     */
	public int getNumOfFruits() {
		
		return numFruits;
	}
	
	 /**
     * Indicates whether or not protein is added.
     *
     * @return true if protein is added, false otherwise
     */
	public boolean getAddProteinPowder() {
		
		return proteinPowder;
	}
	
	 /**
     * Calculates the price of the smoothie based on base price, size, number of fruits, and protein addition.
     *
     * @return the price of the smoothie
     */
	public double calcPrice() {
		
    double price = 0;	
    price += super.addSizePrice();
		
    if (numFruits > 0) {
    	
    	price += (numFruits * EXTRA_FRUIT);
    }
    
    if (proteinPowder == true) {
    	
    	price += EXTRA_PROTEIN;
    }
  
		return price;
	}
	
	/**
     * Checks if this Smoothie equals to anotherBev.
     *
     * @param anotherBev the other Beverage object to compare
     * @return true if the name, type, size, base price, number of fruits, and protein addition are equal, false otherwise
     */
	public boolean equals(Object anotherBev) {
		
	Smoothie smoothie = (Smoothie) anotherBev;
    	
    	if (super.equals(anotherBev)) {
    		
    		if (getNumOfFruits() == smoothie.getNumOfFruits() && getAddProteinPowder() == smoothie.getAddProteinPowder()) {
    			
    			return true;
    		}
    		
    	}
    	
    	return false;
	}
	
	/**
     * Returns the string representation of a Smoothie drink.
     * Contains the name, size, whether or not protein is added, number of fruits, and price.
     *
     * @return the string representation of a Smoothie drink
     */
	public String toString() {
		
		return super.getBevName() + "," + beverageSize + "," + proteinPowder + "," + numFruits + "," + calcPrice();
	}
	
	
}