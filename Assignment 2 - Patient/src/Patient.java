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

public class Patient {
	
	// Declaring all necessary variables
	private String firstName; 
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode; 
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactNumber;
    
    public Patient(String f, String m, String l) { // 1st constructor
    	 
    	firstName = f; // Assign firstName to f
    	middleName = m; // Assign middleName to m
    	lastName = l; // Assign lastName to l
    	
    }
     
    public Patient(String f, String m, String l, String sA, String c, String s, String zC, String pN, String eCName, String eCNumber) { // 2nd constructor
	
	firstName = f;
	middleName = m;
	lastName = l;
	streetAddress = sA;
	city = c;
	state = s;
	zipCode = zC;
	phoneNumber = pN;
	emergencyContactName = eCName;
	emergencyContactNumber = eCNumber;
	
}

    public Patient() { // no-arg constructor
	
	
}

    // GETTERS
    public String getFirstName() {
	return firstName;
}

    public String getMiddleName() {
	return middleName;
}
 
    public String getLastName() {
	 return lastName;
 }
 
    public String getStreetAddress() {
	 return streetAddress;
 }
 
    public String getCity() {
	 return city;
 }
 
    public String getstate() {
	 return state;
 }
 
    public String getZipCode() {
	 return zipCode;
 }
 
    public String getPhoneNumber() {
	 return phoneNumber;
 }
 
    public String getEmergencyContactName() {
	 return emergencyContactName;
 }
 
    public String getEmergencyContactNumber() {
	 return emergencyContactNumber;
 }
  
 
    // SETTERS
    public void setFirstName(String f) {
	 firstName = f;
 }
 
    public void setmiddleName(String m) {
	 middleName = m;
 }
 
    public void setlastName(String l) {
	 lastName = l;
 }
 
    public void setStreetAddress(String sA) {
	 streetAddress = sA;
 }
 
    public void setCity(String c) {
	 city = c;
 }

    public void setState(String s) {
	 state = s;
 }
 
    public void setZipCode(String zC) {
	 zipCode = zC;
 }
 
    public void setPhoneNumber(String pN) {
	 phoneNumber = pN;
 }
 
    public void setEmergencyContactName(String eCName) {
	 emergencyContactName = eCName;
 }
 
    public void setEmergencyContactNumber(String eCNumber) {
	 emergencyContactNumber = eCNumber;
 }
 
 
    public String buildFullName() { // Method to build patient's full name
	 
	 return firstName + " " + middleName + " " + lastName;
 }
 
    public String buildAddress() { // Method to build address
    	return streetAddress + ", " + city + ", " + state + ", " + zipCode;
    }
  
    public String emergencyContact() { // Method build emergency contact
    	return emergencyContactName + emergencyContactNumber;
    }
    
    public String toString() { // This method return all the information about the patient
    	return "Patient info: " + "Name :" + firstName + " " + middleName + " " + lastName + "Address: " + streetAddress + ", " + city + ", " + state + ", " + zipCode + "Emergency contact: " + emergencyContactName + emergencyContactNumber; 
    }
}

