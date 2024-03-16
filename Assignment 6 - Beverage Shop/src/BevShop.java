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

/**
 * Represents a Beverage Shop where orders for different beverages can be placed.
 */
public class BevShop extends Object implements BevShopInterfce {


    /**
     * ArrayList to hold orders.
     */

	public ArrayList<Order> order = new ArrayList<Order>(); // Array List
	

    /**
     * Initializes a new BevShop object.
     */
	public BevShop() { // Constructor
		
		order = new ArrayList<>();
	}
	
	 /**
     * Checks if the time is valid (between 8 and 23).
     *
     * @param time represents the time
     * @return true if times is within the range of 8 to 23, false otherwise
     */
	public boolean isValidTime(int time) { // Checks if the time is valid (between 8 and 23 )
		
		if (time >= MIN_TIME && time <= MAX_TIME) {
			
			return true;
		}
		
		return false;
	}
	
	 /**
     *
     * @return the value for maximum number of fruits.
     */
	public int getMaxNumOfFruits() {
		
		return MAX_FRUIT;
	}
	
	/**
     * Returns the constant value for the Minimum age for offering Alcohol drink.
     *
     * @return the value for the Minimum age for offering Alcohol drink
     */
	public int getMinAgeForAlcohol() { // minimum age for offering Alcohol drink
		
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	/**
     * Returns true if the passed parameter exceeds the Maximum FRUIT allowed.
     *
     * @param numOfFruits number of fruits
     * @return true if the passed parameter exceeds the Maximum FRUIT allowed
     */
	public boolean isMaxFruits(int numOfFruits) {
		
		if (numOfFruits > MAX_FRUIT ) {
			
			return true;
		}
		
		return false;
	}
	
	 /**
     * Returns constant maximum number of alcohol beverages/per order offered by the beverage shop.
     *
     * @return constant maximum number of alcohol beverages/per order offered by the beverage shop
     */
	public int getMaxOrderForAlcohol() {
		
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	/**
     * Checks if the number of alcohol beverages for the current order has reached the maximum.
     *
     * @return true if the number of alcohol beverages for the current order has reached the maximum, false otherwise
     */
	public boolean isEligibleForMore() { // checks if the number of alcohol beverages for the current order has reached the maximum
		
		if (getNumOfAlcoholDrink() < getMaxOrderForAlcohol()) {
			
			return true;
		}
		
		return false;
	}
	
	/**
     * Returns the number of alcohol drinks for the current order.
     *
     * @return the number of alcohol drinks for the current order
     */
	public int getNumOfAlcoholDrink() {
		
		int numOfAlcoholDrinks = 0;
		
		for (int i = 0; i <order.size(); i++) {
			
			numOfAlcoholDrinks += order.get(i).findNumOfBeveType();
		}
		
		return 0;
	}
	
	 /**
     * Checks the valid age for the alcohol drink.
     *
     * @param age the age
     * @return true if age is more than or equal to the minimum eligible age for alcohol, false otherwise
     */
	public boolean isValidAge(int age) { // check the valid age for the alcohol drink
		
		if (age >= MIN_AGE_FOR_ALCOHOL) {
			
			return true;
		}
		
		return false;
	}
	
	/**
     * Creates a new order without adding any beverages to it yet.
     *
     * @param time of the order
     * @param day of the order
     * @param customerName customer name
     * @param customerAge customer age
     */
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		
		Order orderNew = new Order(time, day, customerName, customerAge);
		order.add(orderNew);
	}
	
	/**
     * Processes a coffee order for the current order by adding it to the order.
     *
     * @param bevName beverage name
     * @param size beverage size
     * @param extraShot true if the coffee beverage has an extra shot, false otherwise
     * @param extraSyrup true if the coffee beverage has extra syrup, false otherwise
     */
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		
		Order coffeeOrder = getCurrentOrder();
		
		if(coffeeOrder != null) { // not equal to 0
			
			coffeeOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
		}
	}
	
	/**
     * Processes an alcohol order for the current order by adding it to the order.
     *
     * @param bevName beverage name
     * @param size beverage size
     */
	public void processAlcoholOrder(String bevName, SIZE size) {
		
        Order alcoholOrder = getCurrentOrder();
		
		if(alcoholOrder != null) { // not equal to 0
			
			alcoholOrder.addNewBeverage(bevName, size);
		}
	}
	
	/**
     * Processes a smoothie order for the current order by adding it to the order.
     *
     * @param bevName beverage name
     * @param size beverage size
     * @param numOfFruits number of fruits to be added
     * @param addProtein true if protein is added, false otherwise
     */
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		
        Order smoothieOrder = getCurrentOrder();
		
		if(smoothieOrder != null) { // not equal to 0
			
			smoothieOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
		}
	}
	
	/**
     * Locates an order based on the order number.
     *
     * @param orderNo the order number
     * @return the index of the order in the list of Orders if found or -1 if not found
     */
	public int findOrder(int orderNo) {
		
		for (int i = 0; i < order.size(); i++) {
			
			if (order.get(i).getOrderNo() == orderNo) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	/**
     * Locates an order in the list of orders and returns the total value of the order.
     *
     * @param orderNo the order number
     * @return the calculated price of this order
     */
	public double totalOrderPrice(int orderNo) {
		
		for (int i = 0; i < order.size(); i++) {
			
			if (order.get(i).getOrderNo() == orderNo) {
				
				return order.get(i).calcOrderTotal();
			}
		}
		
		return 0.0;
	}
	
	/**
     * Calculates the total sale of all the orders for this beverage shop.
     *
     * @return the total sale of all the orders
     */
	public double totalMonthlySale() {
		
		double monthlySale = 0.0;
		
		for (int i = 0; i < order.size(); i++) {
			
			monthlySale += order.get(i).calcOrderTotal();
		}
		
		return monthlySale;
	}
	
	/**
     * Returns the total number of orders within the month.
     *
     * @return total number of orders within the month
     */
	public int totalNumOfMonthlyOrders() {
		
		return order.size();
	}
	
	 /**
     * Returns the current order located in the index in the list of orders.
     *
     * @return the current order
     */
	public Order getCurrentOrder() {
		
		if (order.size() > 0) {
			
			return order.get(order.size() - 1);
		}
		
		return null;
	}
	
	 /**
     * Returns the order in the list of orders at the index.
     *
     * @param index the order index
     * @return Order in the list of orders at the index
     */
	public Order getOrderAtIndex(int index) {
		
		if (index >= 0 && index < order.size()) {
			
			return order.get(index);
		}
		
		return null;
	}
	
	 /**
     * Sorts the orders within this beverage shop using the Selection sort algorithm.
     */
	public void sortOrders() {
	
	}
	
	/**
     * Returns the string representation of all the orders and the total monthly sale.
     *
     * @return string representation of all the orders and the total monthly sale
     */
	public String toString() {
		
		return null;
	}
}
