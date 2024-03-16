import java.util.Scanner; // Import scanner class
public class MovieDriver {

	public static void main(String [] args) { // main method
		
		String yesNo = "y";
		try (Scanner scanner = new Scanner(System.in)) {
		
			Movie movie = new Movie(); // Movie object
			
			while (yesNo.equalsIgnoreCase("y")) {
		System.out.println("Enter the name of the movie: "); // Asks the user the movie name
		String movieName = scanner.nextLine();
		movie.setTitle(movieName);
		
		System.out.println("Enter the rating of the movie: "); // Asks the user the movie rating
		String movieRating = scanner.nextLine();
		movie.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold: "); // Asks the user number of movie tickets sold
		int ticketsSold = scanner.nextInt();
		scanner.nextLine();
		movie.setSoldTickets(ticketsSold);
		
		System.out.println(movie.toString()); // Output using the toString method from Movie.java
		
		System.out.println();
		System.out.println("Do you want to enter another? (y or n)"); // Asks the user if they want to enetr another movie or not
		yesNo = scanner.nextLine();
		
			}
			
			System.out.println("Goodbye"); // Prints Goodbye message when the program ends
		}
		
	}
	
}
