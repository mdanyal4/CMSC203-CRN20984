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

public class ManagementCompany {

	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	
	private String n;
	private String txId;
	private double fee;
	private int coordinateX;
	private int coordinateY;
	private int plotWidth;
	private int plotDepth;
	private int numOfProperty;
	private Property[] properties;
	
	// EXTRAS (not sure if this is needed)
	double totalRent = 0.0;
	
	public ManagementCompany() {
		
		properties = new Property[MAX_PROPERTY];
		numOfProperty = 0;
		
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		
		n = name;
		txId = taxID;
		fee = mgmFee;
		
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		
		n = name;
		txId = taxID;
		fee = mgmFee;
		coordinateX = x;
		coordinateY = y;
		plotWidth = width;
		plotDepth = depth;
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		
	}
	
	public int addProperty(String name, String city, double rent, String owner) {
		
		if (numOfProperty < MAX_PROPERTY) {
			
		}
		
		return 0;
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return 0;
	}
	
	public int addProperty(Property property) {
		return 0;
	}
	
	public void removeLastProperty() {
		
	}
	
	public boolean isPropertiesFull() { // This method checks if properties Array has reached it's max capacity
	return true;	
	}
	
	
	// GETTERS
	public int getPropertiesCount() {
		return MAX_PROPERTY; // returns the number of properties inside the Array
	}
	
	public double getTotalRent() {
		return totalRent;
	}
	
	public Property getHighestRentPropperty() {
		return null; // returns the property in the array which has the highest amount of rent
	}
	
	
	// Method to check if management fee is within range
	public boolean isManagementFeeValid() {
		
		if(fee > 0 || fee < 100) {
			
		return true;
		}
		
		else 
			
			return false;
	}
	
	// GETTERS (2)
	public String getName() {
		return n;
	}
	
	public String getTaxID() {
		return txId;
	}
	
	 public Property[] getProperties() {
		 return null;
	 }
	
	public double getMgmFeePer() {
		return fee;
	}
	 
	public Plot getPlot() {
		return Plot; 
	}
	
	public String toString() {
		return null; // returns information of ALL properties within the management company.
	}
	
	}

