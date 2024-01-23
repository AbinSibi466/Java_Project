package cineticket.tests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cineticket.PaymentInterface;


//allows us to check if the payment interface calculates the price 
//correctly according to the selected seat size 

public class TestCase8 {
	
	PaymentInterface paymentInterface = new PaymentInterface(2);
	

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		paymentInterface = null;
	}

	@Test
	public void positiveTest() {

	
		assertEquals(paymentInterface.getLblPrice().getText(),"The price you need to pay is 10$");
	}
	
	public void negativeTest() {

		
		assertEquals(paymentInterface.getLblPrice().getText(),"The price you need to pay is 15$");
	}

}
