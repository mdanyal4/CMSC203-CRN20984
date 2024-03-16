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

public class PatientDriverApp {

	public static void main(String[] args) { // Main method
		
		Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "301-123-4567", "Bill Santori ", "777-555-1212");
		    displayPatient(patient);
		
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0); // Procedure 1
		displayProcedure(procedure1); // Display procedure 1
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43); // Proecdure 2
		displayProcedure(procedure2); // Display procedure 2
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);	// Procedure 3
		displayProcedure(procedure3); // Display procedure 3
		
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3); 
		System.out.println("Total Charges: " + totalCharges); // Display total charges
	
		System.out.println("Student Name: Mohammad Danyal"); // My name
		System.out.println("MC#: MC21130618"); // My MC Id
		System.out.println("Due Date: 9/25/2023"); // Assignment due date
}
	
	public static void displayPatient(Patient patient) { // This mtehod displays the patient's information
		System.out.println("Patient Information:");
		System.out.println();
	    System.out.println("Name: " + patient.buildFullName());
	    System.out.println("Address: " + patient.buildAddress());
	    System.out.println("Phone Number: " + patient.getPhoneNumber());
	    System.out.println("Emergency Contact: " + patient.emergencyContact());
	    System.out.println();
	}
	
	public static void displayProcedure(Procedure procedure) { // This method displays all the procedures information
	    System.out.println("Name: " + procedure.getProcedureName());
	    System.out.println("Date: " + procedure.getProcedureDate());
	    System.out.println("Practitioner: " + procedure.getPractitioner());
	    System.out.println("Charge: $" + procedure.getCharge());
	    System.out.println();
	 }

	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) { // This method is going to calcluate the total charges for all the procedures
	    double totalCharges = procedure1.getCharge() + procedure2.getCharge() + procedure3.getCharge();
	    return totalCharges;
	}
	
}

