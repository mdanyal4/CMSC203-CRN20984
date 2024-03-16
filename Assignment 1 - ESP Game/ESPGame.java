/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Color guessing game)
 * Due: 09/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or * any source. I have not given my code to any student.
 * Print your Name here: Danyal Mohammad
*/

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

public static void main(String[] args) { // main method
		
		final String COLOR_RED = "Red";  
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final String COLOR_PURPLE = "Purple";
        final String COLOR_INDIGO = "Indigo";
        
        try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();
			
			System.out.print("Enter your name: "); // asks user for their name.
			String USER_NAME = scanner.nextLine(); // takes users name as input.
			
			System.out.print("Describe yourself: "); // asks user for their description.
			String USER_INTRO = scanner.nextLine(); // takes users description as input.
			
			System.out.print("Due date (mm/dd/yyy): "); // asks user for the due date.
			String DUE_DATE = scanner.nextLine(); // takes due date as input.
			
			System.out.println("CMSC203 Assignment1: Test your ESP skills!");
			System.out.println("Round 1");
			System.out.println();
			
			 String RANDOM_COLOR = null;
			 int CORRECT_GUESS = 0;
			 
			for (int i = 0; i < 11; i++) { // uses FOR LOOP to generate a RANDOM NUMBER each round and assigns the RANDOM NUMBER to a RANDOM COLOR each round.
				
				int RANDOM_INT = random.nextInt(7);
			    switch (RANDOM_INT) {
			    
			    case 0: 
			 	   RANDOM_COLOR = COLOR_RED; // if the random number generated is 0, the color will be Red.
			        break;
			        
			    case 1:
			 	   RANDOM_COLOR = COLOR_GREEN; // if the random number genreated is 1, the color will be Green.
			 	   break;
			 	   
			    case 2:
			 	   RANDOM_COLOR = COLOR_BLUE; // if the random number generated is 2, the color will be Blue.
			 	   break;
			 	   
			    case 3:
			 	   RANDOM_COLOR = COLOR_ORANGE; // if the random number generated is 3, the color will be Orange.
			 	   break;
			 	   
			    case 4:
			 	   RANDOM_COLOR = COLOR_YELLOW; // if the random number generated is 4, the color will be Yellow.
			 	   break;
			 	   
			    case 5:
			 	   RANDOM_COLOR = COLOR_PURPLE; // if the random number generated is 5, the color will be Purple.
			 	   break;
			 	   
			    case 6:
			 	   RANDOM_COLOR = COLOR_INDIGO; // if the random number generated is 6, the color will be Indigo.
			 	   break;
 }
			   System.out.println();
			   System.out.println("I am thinking of a color.");
			   System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple or Indigo?");
			   System.out.println("Enter your guess: "); // asks the user to enter their guess, of the random color.
			   String USER_GUESS = scanner.nextLine(); // takes users guess as input.
			   System.out.println();
			   
			   if (USER_GUESS.equals(RANDOM_COLOR)) { // checks if users guess equals to the random color selected for that round.
				   
				   System.out.println("I was thinking of " + RANDOM_COLOR);
				   CORRECT_GUESS++; // if the user guesses correctly, they are given 1 point (total 11). 
			   }
			   
				   else { 
					   
					   System.out.println("I was thinking of " + RANDOM_COLOR);
				   }
			   
			}
			
			System.out.println();
			System.out.println("Game Over."); // Displays this once all 11 rounds have been finished.
			System.out.println();
			System.out.println("You guessed " + CORRECT_GUESS + " out of 11 colors correctly.");
			System.out.println("User Name: " + USER_NAME);
			System.out.println("User Description: " + USER_INTRO + ".");
			System.out.println("Due Date: " + DUE_DATE);
			
		}
	}
	
}
