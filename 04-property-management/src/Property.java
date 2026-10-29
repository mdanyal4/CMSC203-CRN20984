/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Property Management)
 * Due: 10/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Mohammad Danyal
*/

public class Property {

	private String pN;
	private String c;
	private double rA;
	private String own;
	private Plot plot;
	private int coordinateX;
	private int coordinateY;
	private int plotWidth;
	private int plotDepth;
	
    public  Property() {
	
    	 pN = "";
         c = "";
         rA = 0.0;
         own = "";
         plot = new Plot();
}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		
	pN = propertyName;
	c = city;
	rA = rentAmount;
	own = owner;
	plot = new Plot();
	
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		
		pN = propertyName;
		c = city;
		rA = rentAmount;
		own = owner;
		coordinateX = x;
		coordinateY = y;
		plotWidth = width;
		plotDepth = depth;
		plot = new Plot(x, y, width, depth);
	}
	
	public Property(Property otherProperty) {
		
		 pN = otherProperty.getPropertyName(); 
		    c = otherProperty.getCity(); 
		    rA = otherProperty.getRentAmount(); 
		    own = otherProperty.getOwner(); 
		    plot = new Plot(otherProperty.getPlot());
		
	}
	
	// GETTERS
	public String getCity() {
		return c;
	}
	
	public String getOwner() {
		return own;
	}
	
	public Plot getPlot() {
		
		return plot;
	}
	
	public String getPropertyName() {
		return pN;
	}
	
	public double getRentAmount() {
		return rA;
	}
	
	// toString method
	public String toString() {
		return pN + "," + c + "," + own + "," + rA;
	}
	
}