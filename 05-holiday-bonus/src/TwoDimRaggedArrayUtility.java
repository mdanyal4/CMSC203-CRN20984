/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Holiday Bonus)
 * Due: 11/13/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Mohammad Danyal
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public TwoDimRaggedArrayUtility() {
		
	}
	
	public static double getAverage(double[][] data) { // returns the average of the elements in the 2D array
		
		double avg = 0.0;
		int incrementer = 0;
		
		// ROWS
	for (int i = 0; i < data.length; i++) {

		// COLUMNS
		for (int j = 0; j < data[i].length; j++) {
			
			avg += data[i][j];
			incrementer++;
		}
		
	}
	    avg /= incrementer;
	    
		return avg;
	}
	
	public static double getColumnTotal(double[][] data, int col) { // returns total of the selected column in the two dimensional array index 0 refers to the first column 
		
		double totalCol = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			
			totalCol += data[i][col];
		}
		
		return totalCol;
	}
	
	public static double getHighestInArray(double[][] data) { // returns largest elements in the 2D array
	
		double highestValue = Double.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {

			
			for (int j = 0; j < data[i].length; j++) {
				
				if (data[i][j] > highestValue) {
					
					highestValue = data[i][j];
					
				}
				
				else {
					
					return highestValue;
				}
				
			}
		}
		
		return highestValue;
	}
	
	public static double getHighestInColumn(double[][] data, int col) { // returns largest element of the selected column in the two dimensional array index 0 refers to the first column
		
		double highestCol = Double.MIN_VALUE;
		
        for (int i = 0; i < data.length; i++) {
			
	           if (data[i][col] > highestCol) {
		
		highestCol = data[i][col];
		
	}
	
		}

		
		return highestCol;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) { // returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column
		
		
		double highest = Double.MIN_VALUE;
		int index = 0;
		
		for (int i = 0; i < data.length; i++) {
			
			try { 
				
			if (data[i][col] > highest) {
				
				index = i;
				highest=data[i][col];
				
			}
			
			}	catch(Exception e) { }
		} 
			
		
		
		return index;
	}
	
	public static double getHighestInRow(double[][] data, int row) { // returns largest element of the selected row in the two dimensional array index 0 refers to the first row
		
		double highestRow = Double.MIN_VALUE;
		
		for (int i = 0; i < data[i].length; i++) {
					
			if (data[row][i] > highestRow) {
				
				highestRow = data[row][i];
				
			}
			
				}
		
				return highestRow;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) { // returns the largest element of the selected row in the two dimensional array index 0 refers to the first row
		
		double highest = Double.MIN_VALUE;
		int index = 0;
		
		for (int i = 0; i < data[i].length; i++) {
			
			if (data[row][i] > highest) {
				
				index = i;
				
			}
			
		}
		
		return index;
	}
		
	public static double getLowestInArray(double[][] data) { // returns smallest elements in the 2D array
		
        double lowestValue = Double.MAX_VALUE;
		
		for (int i = 0; i < data.length; i++) {

			
			for (int j = 0; j < data[i].length; j++) {
				
				if (data[i][j] < lowestValue) {
					
					lowestValue = data[i][j];
					
				}
				
				else {
					
					return lowestValue;
				}
				
			}
		}
		
		return lowestValue;
	}
	
	public static double getLowestInColumn(double[][] data, int col) { // returns smallest element of the selected column in the two dimensional array index 0 refers to the first column 
		
		double lowestCol = Double.MAX_VALUE;
		
		for (int i = 0; i < data.length; i++) {
					
			if (data[i][col] < lowestCol) {
				
				lowestCol = data[i][col];
				
			}
			
				}
		
				return lowestCol;
			}	
	
	public static int getLowestInColumnIndex(double[][] data, int col) { // returns index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column
		
		double lowest = Double.MAX_VALUE;
		int index = 0;
		
		for (int i = 0; i < data.length; i++) {
			
			try {
				
			if (data[i][col] < lowest) {
				
				index = i;
				lowest = data[i][col];
				
			}
			
			} catch(Exception e) { }
		}
		
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row) { // returns smallest element of the selected row in the two dimensional array index 0 refers to the first row
		
    double lowestRow = Double.MAX_VALUE;
		
		for (int i = 0; i < data[i].length; i++) {
					
			if (data[row][i] < lowestRow) {
				
				lowestRow = data[row][i];
				
			}
			
				}
		
				return lowestRow;
	}
		
	public static int getLowestInRowIndex(double[][] data, int row) { // returns index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row
		
		double lowest = Double.MAX_VALUE;
		int index = 0;
		
		for (int i = 0; i < data[i].length; i++) {
			
			if (data[row][i] < lowest) {
				
				index = i;
				
			}
			
		}
		
		return index;
	}
		
	public static double getRowTotal(double[][] data, int row) { // returns total of the selected row in the 2D array
		
        double totalRow = 0.0;
		
		for (int i = 0; i < data[row].length; i++) {
			
			totalRow += data[row][i];
		}
		
		return totalRow;
	}
		
	public static double getTotal(double[][] data) { // returns total of all the elements of the 2D array
		
		 double total = 0.0;
		 
		 for (int i = 0; i < data.length; i++ ) {
			 
			 for (int j = 0; j < data[i].length; j++) {
				 
				 total += data[i][j];
				 
			 }
			 
		 }
		 
		 return total;
	}
		
	public static double[][] readFile(File file) throws FileNotFoundException{ // Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum columns for each row is 10. Each row in the file is separated by a new line Each element in the row is separated by a space
		 
		
			Scanner sc = new Scanner(file);
			
	        String[] array = new String[10];
			int key = 0;
			
			while(sc.hasNextLine()) {
				
				array[key] = sc.nextLine();
				key++;
				
			}
			
			double[][] arrayReturn = new double[key][];
			
			// Double = Double.parseDouble(array);
			int col = 0;
			
			for (int i = 0; i < key; i++) { // this gives the number of rows in 1D array
			
			for (int j = 0; j < array[i].length(); j++) {
				
				
		     if (array[i].charAt(j) == ' ') {
					
				col++;	
					
				}
				
			}
			
			arrayReturn[i] = new double[col];
			
			}
			
			for (int i = 0; i < key; i++) { 
				
				int index = 0;
				int charIndex = 0;
				
			for (int j = 0; j < array[i].length(); j++) {
				
				if (array[i].charAt(j) == ' ') {
					try {
					arrayReturn[i][index] = Double.parseDouble(array[i].substring(charIndex, j - 1));
					} catch (Exception e) {}
					charIndex = j + 1;	
					}
				
				index++;
				
			}
				
			}
			
			
			sc.close(); // Close file when done
		
		return arrayReturn;
    }
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException { // writes the ragged array of doubles into the file 
		
		
			PrintWriter pw = new PrintWriter(outputFile);
			
			for (int i = 0; i < data.length; i++) {
				
				for (int j = 0; j < data[i].length; j++) {
					
					pw.printf("%.2f", data[i][j]);
					
				}
				
				pw.println();
				
			}
			
			
		pw.close();
	}	
}
