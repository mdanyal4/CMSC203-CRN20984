/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (Property Management)
 * Due: 10/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Mohammad Danyal
*/

public class Plot {

	 private int plotDepth;
	 private int plotWidth;
	 private int coordinateX; 
	 private int coordinateY;
	
	public Plot() { // constructor 1
		plotWidth = 1;
		plotDepth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) { // constructor 2
		
		plotDepth = depth;
		plotWidth = width;
		coordinateX = x;
		coordinateY = y; 
		
	}
	
	public Plot(Plot otherPlot) {
		
		plotDepth = otherPlot.getDepth();
		plotWidth = otherPlot.getWidth();
		coordinateX = otherPlot.getX();
		coordinateY = otherPlot.getY();	
	}
	
	public boolean overlaps(Plot plot) { // this method checks if the properties are overlapping each other

		if (((coordinateX + plotWidth) >= plot.getX()) && ((coordinateY + plotDepth) >= plot.getY())) {
			return true;
		}
		
		else if (((coordinateX + plotWidth) >= plot.getX()) && ((coordinateY + plotDepth) <= plot.getY())) {
			return true;
		}
		
		else if (((coordinateX + plotWidth) <= plot.getX()) && ((coordinateY + plotDepth) >= plot.getY())) {
			return true;
		}
		/*
		else if (((coordinateX + plotWidth) <= plot.getX()) && ((coordinateY + plotDepth) <= plot.getY())) {
			return false;
		}
		*/

		else
			return false;
	}
	
	public boolean encompasses(Plot plot) { // this method checks if the properties encompass each other
		
		Plot plotEncompasses = new Plot(); 
		
		
		    if (overlaps(plot)) {
			if ((coordinateX + plotWidth) >= (plot.getX() + plot.getWidth()) && (coordinateX <= plot.getX())) {
			return true;
		    }
			if ((coordinateY + plotDepth) >= (plot.getY() + plot.getDepth())) {
				return true;
			}
		    }
			
		return false;	
			
	}
			
	// GETTERS
	public int getDepth() {
		return plotDepth;
	}
	
	public int getWidth() {
		return plotWidth;
	}
	
	public int getX() {
		return coordinateX;
	}
	
	public int getY() {
		return coordinateY;
	}
	
	// SETTERS
	public void setDepth(int depth) {
		plotDepth = depth;
	}
	
	public void setWidth(int width) {
		plotWidth = width;
	}
	
	public void setX(int X) {
		coordinateX = X;
	}
	
	public void setY(int Y) {
		coordinateY = Y;
	}
	
	public String toString() { // toString method which displays all the information
		return coordinateX + "," + coordinateY + "," + plotWidth + "," + plotDepth;
	}
	
}
