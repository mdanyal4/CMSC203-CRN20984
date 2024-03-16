/*
	 * Class: CMSC203 
	 * Instructor: Ahmed Tarek
	 * Description: (Patient Portal)
	 * Due: 9/25/2023
	 * Platform/compiler: Eclipse
	 * I pledge that I have completed the programming 
	 * assignment independently. I have not copied the code 
	 * from a student or any source. I have not given my code 
	 * to any student.
	   Print your Name here: Mohammad Danyal
	*/

public class Procedure  {
// Declaring all necessary variables
	String procedureName;
	String procedureDate;
	String practitioner;
	double charge;
	
	public Procedure(String pN, String pD) { // 1st constructor
		procedureName = pN;
		procedureDate = pD;
	}
	
	public Procedure(String pN, String pD, String pR, double cR) { // 2 constructor
		procedureName = pN;
		procedureDate = pD;
		practitioner = pR;
		charge = cR;
	}
	
	public Procedure() { // no-arg constructor
		
	}
	
	// GETTERS
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitioner() {
		return practitioner;
	}
	public double getCharge() {
		return charge;
	}

	// SETTERS
	public void setProcedureName(String pN) {
		procedureName = pN;
	}
	public void setProcedureDate(String pD) {
	    procedureDate = pD;	
	}
	public void setPractitioner(String pR) {
		practitioner = pR;
	}
	public void setCharge(double cR) {
		charge = cR;
	}
	
	@Override
	public String toString() { // This method returns the information for all the procedures
	    return "Procedure info: Name: " + procedureName + ", Date: " + procedureDate + ", Practitioner: " + practitioner + ", Charge: " + charge;
	}
	
}
