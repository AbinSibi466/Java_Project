package cineticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cineticket.DatabaseConnection;

//test case 5 allows us to check from the database whether the seats are empty. 
public class TestCase5 {
	DatabaseConnection db = new DatabaseConnection();

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		db = null;
	}

	@Test
	public void positiveTest() {
	
		Boolean isTaken = db.getSeats(1).get(0);
		assertEquals(true,isTaken);
	}
	
	@Test
	public void negativeTest() {
		
		Boolean isTaken = db.getSeats(1).get(7);
		assertNotEquals(true,isTaken);
	}

}
