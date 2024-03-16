/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Encryption & Decryption of a String)
 * Due: 10/09/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Mohammad Danyal
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */

public class CryptoManager {
	
	private static final char LOWER_RANGE = ' '; // minimum range
	private static final char UPPER_RANGE = '_'; // maximum range
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1; // total range

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) { // this method check if string is within the range
		for (int i = 0; i < plainText.length(); i++) {
			
		if	(plainText.charAt(i) >= LOWER_RANGE && plainText.charAt(i) <= UPPER_RANGE) { // "if" statement to check if each character of the string is within range  
			
		}
		
		else {
			
			return false; // if it is within range, we return true
			
		}
		
		}
		return true; // if it's not within range, we return false
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) { // this method encrypts the string according to the Caeser Cipher method.
		if (isStringInBounds(plainText) == false) {
			
			return "The selected string is not in bounds, Try again.";
			
		}
		
		String encryptionText = "";
		for (int i = 0; i < plainText.length(); i++) {
			
			 int asciiValue = plainText.charAt(i) + key;
			 
			 if (asciiValue > UPPER_RANGE) { // checks is ASCII value is grater than the upper range
		            while (asciiValue > UPPER_RANGE) {
		                asciiValue -= RANGE;
		            }
		        }
			
			  encryptionText += (char) asciiValue;

	}
		return encryptionText; // return encryptionText
	}
		
	
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) { // this method encrypts a string according to the Bellaso Cipher method
		
		if (isStringInBounds(plainText) == false) {
			return "The selected string is not in bounds, Try again.";
		}
		
	 String encryptedText = "";
	 
	 int keyIndex = -1; // the index of the character being encrypted
		
	 for (int i = 0; i < plainText.length(); i++) {
		 if (keyIndex >= bellasoStr.length() - 1) {
			 
			 keyIndex = 0;
			 
		 }
		 
		 else {
			 
			 keyIndex++;
		 }
		 
		 int asciiValue = plainText.charAt(i) + bellasoStr.charAt(keyIndex);
		 
		 while (asciiValue > UPPER_RANGE) {
			 asciiValue -= RANGE; 
		 }
		 
		 encryptedText += (char) asciiValue;
	 }
	 
	 return encryptedText; // return encryptedText
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	
	public static String caesarDecryption (String encryptedText, int key) { // this mtehod decrypts the string that was encrypted using Caeser Cipher
						
		String encryptionText = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			int asciiValue = (int) encryptedText.charAt(i) - key;;
			
				if (asciiValue < LOWER_RANGE) { // checks if ASCII value is lower than the lower range
				while (asciiValue < LOWER_RANGE) {
					asciiValue += RANGE;
				}
			}
			
			encryptionText += (char) asciiValue; // stores the ASCII character in the encryptionText

	}
		return encryptionText; // return encryptionText
	}
		
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	
	public static String bellasoDecryption(String encryptedText, String bellasoStr) { // this method decrypts the string that was encrypted using Bellaso Cipher
		
		String encryptionText = "";
		int keyIndex = -1; // the index of the character being encrypted
		 for (int i = 0; i < encryptedText.length(); i++) {
			 
			 if (keyIndex >= bellasoStr.length() - 1) {
				 
				 keyIndex = 0;
				 
			 }
			 
			 else {
				 
				 keyIndex++;
			 }
			 
			 int asciiValue = encryptedText.charAt(i) - bellasoStr.charAt(keyIndex);
			 
			 while (asciiValue < LOWER_RANGE) {
				 asciiValue += RANGE; 
			 }
			 
			 encryptionText += (char) asciiValue; // stores ASCII character in encryptionText
		 }
		 
		 return encryptionText; // return encryptionText
		}
		
	}
