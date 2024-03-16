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

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents an order made by a customer.
 */
public class Order extends Object implements OrderInterface, Comparable<Order> {

	int numberOrder, timeOrder, randomNumber;
	DAY dayOrder;
	Customer customer;
	
	private ArrayList<Beverage> beverage = new ArrayList<Beverage>();
	
	  /**
     * Constructor to create an Order with specified details.
     *
     * @param orderTime time of the order (between 8 and 23)
     * @param orderDay day of the order
     * @param cust a Customer object
     */
	public Order(int orderTime, DAY orderDay, Customer cust) { // Constructor
		
	    this.randomNumber = numberOrder;
		this.timeOrder = orderTime;
		this.dayOrder = orderDay;
		customer = cust;
		
	}
	
	public Order(int time, DAY day, String customerName, int customerAge) {
		// TODO Auto-generated constructor stub
	}

	 /**
     * Automatically generates an order number.
     *
     * @return a random order number between 10000 and 90000
     */
	public int generateOrder() { // Automatically generates order number
		
		Random random = new Random();
		
		int min = 10000;
        int max = 90000;
        randomNumber = random.nextInt(max - min + 1) + min;

		return randomNumber;
	}
	
	 /**
     * Gets the order number.
     *
     * @return the order number
     */
	public int getOrderNo() { // returns the order number
	
		return numberOrder;
	}
	
	 /**
     * Gets the order time.
     *
     * @return the order time
     */
	public int getOrderTime() { // returns the order time
		
		return timeOrder;
	}
	
	 /**
     * Gets the order day.
     *
     * @return the order day
     */
	public DAY getOrderDay() { // returns the order day
		
		return dayOrder;
	}
	
	  /**
     * Gets the customer associated with the order.
     *
     * @return the customer
     */
	public Customer getCustomer() { // gets the customer
		
		
		return customer;
	}
	
	public DAY getDay() { // returns the order day
		
		return dayOrder;
	}
	
	/**
     * Checks if it's the weekend.
     *
     * @return true if it's the weekend, false otherwise
     */
	public boolean isWeekend() { // checks if it's the weekend
		
		if(dayOrder == DAY.SUNDAY) {
			
			return true;
		}
		else if(dayOrder == DAY.SATURDAY) {
			
			return true;
		}
		
		return false;
	}
	
	 /**
     * Gets the beverage at the specified position in this order.
     *
     * @param itemNo the position of the beverage in the order
     * @return the beverage at the specified position
     */
	public Beverage getBeverage(int itemNo) { // returns the beverage listed in the itemNo of the order
		
		return beverage.get(itemNo);
	}
	
	 /**
     * Gets the total number of beverages ordered within this order.
     *
     * @return the total number of beverages ordered
     */
	public int getTotalItems() { // returns the total number of beverages ordered within this order
	
		return beverage.size();
	}
	
	 /**
     * Adds a coffee order to this order.
     *
     * @param bevName the name of the coffee beverage
     * @param size the size of the coffee
     * @param extraShot true if the coffee has an extra shot, false otherwise
     * @param extraSyrup true if the coffee has extra syrup, false otherwise
     */
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) { // adds coffee order to this order
		
		Beverage coffee = new Coffee(bevName, size, extraShot, extraSyrup);
		beverage.add(coffee);
	}
	
	 /**
     * Adds an alcohol order to this order.
     *
     * @param bevName the name of the alcohol beverage
     * @param size the size of the alcohol beverage
     */
	public void addNewBeverage(String bevName, SIZE size) { // adds alcohol order to this order
		
		Beverage alcohol = new Alcohol(bevName, size, isWeekend());
		beverage.add(alcohol);
	}
	
	/**
     * Adds a smoothie beverage to this order.
     *
     * @param bevName the name of the smoothie beverage
     * @param size the size of the smoothie
     * @param numOfFruits the number of fruits added to the smoothie
     * @param addProtein true if protein is added, false otherwise
     */
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addProtein) { // adds the smoothie beverage to this order
		
		Beverage smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
		beverage.add(smoothie);
	}
	
	  /**
     * Calculates and returns the total amount for this order.
     *
     * @return the total amount for this order
     */
	public double calcOrderTotal() { // calculates and returns the total amount for this order
		
		double total = 0.0;
		
		for (int i = 0; i < beverage.size(); i++) {
			
			total += beverage.get(i).calcPrice();
		}

		return total;
	}
	
	 /**
     * Returns the number of beverages of the same type in this order.
     *
     * @param type the type of the beverage
     * @return the number of beverages of the specified type in this order
     */
	public int findNumOfBeveType(TYPE type) { // returns the number of beverages of same type in an order
		
		int numOfBeveType = 0;
		
		for (int i = 0; i < beverage.size(); i++) {
		
			if(type == beverage.get(i).getType()) {
				
				numOfBeveType++;
			}
		}
		
		return numOfBeveType;
	}
	
	/**
     * String representation of the order.
     *
     * @return string containing the order information
     */
	public String toString() { // String representation of the order, Includes order number, time , day, customer name and age and the list of beverages
		
		String strRepOfOrder = "";
		strRepOfOrder += getOrderNo() + ", " + getOrderTime() + ", " + getOrderDay() + ", " + customer.getName() + " and " + customer.getAge();
		
         for (int i = 0; i < beverage.size(); i++) {
			
        	strRepOfOrder += " " + beverage.get(i).toString();
		}
         
         
         strRepOfOrder += " " + calcOrderTotal();
		
		
		return strRepOfOrder;
	}

	 /**
     * Compares this Order object with another Order for ordering.
     *
     * @param anotherOrder the Order to be compared
     * @return a negative integer, zero, or a positive integer as this Order is less than, equal to, or greater than the specified Order
     */
	public int compareTo(Order anotherOrder) {
		
		
		
		if (getOrderNo() == anotherOrder.getOrderNo()) {
			
			return 0;
		}
		
		if(getOrderNo() < anotherOrder.getOrderNo()) {
			
			return -1;
		}
		
		if(getOrderNo() > anotherOrder.getOrderNo()) {
			
			return 1;
		}
		
		
		return 0;
	}
}
