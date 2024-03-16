import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook obj1; // object 1
	private GradeBook obj2; // object 2
	
	@BeforeEach
	void setUp() throws Exception {
		
		//2 new objects of GradeBook to hold 5 scores 
		obj1 = new GradeBook(5);
		obj2 = new GradeBook(5);
		
		// calling the addScore method to add scores
		obj1.addScore(50.0);
		obj2.addScore(75.0);
		
		obj1.addScore(80.0);
		obj2.addScore(95.0);
		
		obj1.addScore(100.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		obj1 = null; // assigning null to object 1
		obj2 = null; // assigning null to object 2
		
	}

	@Test
	void testAddScore() {
		
		// adding scores to both objects
		assertTrue(obj1.toString().equals("50.0 80.0 100.0 "));
		assertTrue(obj2.toString().equals("75.0 95.0 "));

	}

	@Test
	void testSum() {
		
		// sum of scores of both objects
		assertEquals(230, obj1.sum());
		assertEquals(170, obj2.sum());
	
	}

	@Test
	void testMinimum() {
		
		// minimum scores of both objects
		assertEquals(50, obj1.minimum());
		assertEquals(75, obj2.minimum());
	
	}

	@Test
	void testFinalScore() {
		
		// final score of both objects
		double finalScore1 = obj1.finalScore();
		assertEquals(180, finalScore1);
		
		double finalScore2 = obj2.finalScore();
		assertEquals(95, finalScore2);
	
	}

	@Test
	void testGetScoreSize() {
		
		// score size of both objects
		assertEquals(3, obj1.getScoreSize());
		assertEquals(2, obj2.getScoreSize());
		
	}

	// nothing was mentioned in document for this method 
	/** @Test
	void testToString() {
		fail("Not yet implemented");
	}
*/

}
