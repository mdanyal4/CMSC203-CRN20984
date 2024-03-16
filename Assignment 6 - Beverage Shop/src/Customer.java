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
 * Represents a Customer.
 */
public class Customer {

	String customerName;
	int customerAge = 0;
	
	   /**
     * Constructor to create a Customer with name and age.
     *
     * @param name the name of the customer
     * @param age the age of the customer
     */
	public Customer(String name, int age) {
		
		this.customerName = name;
		this.customerAge = age;
		
	}
	
	 /**
     * Copy constructor to create a Customer.
     *
     * @param c the Customer object to copy
     */
	public Customer(Customer c) { // copy constructor
		
	}
	
	/**
     * Gets the age of the customer.
     *
     * @return the age of the customer
     */
	public int getAge() {
	
		return customerAge;
	}
	
	/**
     * Sets the age of the customer.
     *
     * @param age the age of the customer to set
     */
	public void setAge(int age) {
		
		customerAge = age;
	}
	
	 /**
     * Gets the name of the customer.
     *
     * @return the name of the customer
     */
	public String getName() {
		
		return customerName;
	}
	
	 /**
     * Sets the name of the customer.
     *
     * @param name the name of the customer to set
     */
	public void setName(String name) {
		
		customerName = name;
	}
	
	/**
     * String representation of the customer includes the name and age.
     *
     * @return string containing the name and age of the customer
     */
	public String toString() {
		
		return customerName + customerAge;
	}
	
}