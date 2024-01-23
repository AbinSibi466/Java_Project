package cineticket.tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cineticket.DatabaseConnection;


//test case 10 allows us to check if the taken seat seems as taken when a seat is taken
public class TestCase10 {
	
	DatabaseConnection db = new DatabaseConnection();


	@Before
	//Seat 3 is taken before the test
	public void setUp() throws Exception {
		db.TakeSeat(1,3);
	}

	@After
	//Seat 3 made available after the test
	public void tearDown() throws Exception {
		
		db.UpdateSeats(1,3);
	}

	@Test
	//Checking if the seat 3 is taken
	public void positiveTest() {
		
			db.getSeats(1).get(2);
			
			assertEquals(db.getSeats(1).get(2), true);
	}
	
	@Test
	//Checking if the seat 3 is not taken
	public void negativeTest() {
		
			db.getSeats(1).get(2);
			
			assertNotEquals(db.getSeats(1).get(2), false);
	}

}
