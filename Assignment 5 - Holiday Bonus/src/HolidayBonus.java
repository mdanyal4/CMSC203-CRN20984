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

public class HolidayBonus {

	private static final int HIGHSALE_BONUS = 5000;
	private static final int LOWSALE_BONUS = 1000;
	private static final int SALE_BONUS = 2000;
	
	public HolidayBonus() {
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data) {
		
		double[] holidayBonus = new double[data.length];
		
		int maxColumn = Integer.MIN_VALUE;
		
		for (int i = 0; i < data.length;i++) {
			
			
			
			if (maxColumn < data[i].length) {
				maxColumn = data[i].length;
			}
			
			
		}
		
		

			
		for (int i = 0; i < maxColumn; i++)  {
			
			int highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
		    int lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
		   
			
			
            if (highest == lowest) {
		    	
                holidayBonus[highest] += HIGHSALE_BONUS;
		    }
		    
		    else if (data[highest][i] <= 0) {

		    }
            
		    else {
            
		    	holidayBonus[highest] += HIGHSALE_BONUS;
		    	holidayBonus[lowest] += LOWSALE_BONUS;
		    
		    }
            
			for (int j = 0; j < data[i].length; j++) {
			    
				
			try {	
			if (data[j][i] < TwoDimRaggedArrayUtility.getHighestInColumn(data, i) && data[j][i] > TwoDimRaggedArrayUtility.getLowestInColumn(data, i)) {
		   
				holidayBonus[j] += SALE_BONUS;
		   
	        }
			
			else if (data[j][i] <= 0) {
				
			}
			} catch(Exception e) {}
			
			}
		}
	  
		return holidayBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		
		double total = 0;
		
		double[] array = calculateHolidayBonus(data);
		
		for (int i = 0; i < array.length; i++) {
			
			total+=array[i];
			
		}
		
		return total;
	}
}
