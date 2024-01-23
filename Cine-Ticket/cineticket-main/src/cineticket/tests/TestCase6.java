package cineticket.tests;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cineticket.AddMovieInterface;
import cineticket.Movies;

public class TestCase6 {
	AddMovieInterface addMovie = new AddMovieInterface();
	Movies movie = null;
	Boolean isNull = false;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		addMovie=null;
	}

	//CHECKS IF AN ALREADY EXISTED MOVIE CAN BE INSERTED INTO DATABASE OR NOT
	@Test
	
	public void positiveTest() {
		
		movie = addMovie.insertMovies("name","time" , 1, "price");
		
		if(movie == null) {
			isNull = true;
		}
		assertEquals(isNull,true);
	}
	
	//CHECKS IF AN ALREADY EXISTED MOVIE CAN BE INSERTED INTO DATABASE OR NOT
	@Test
	public void negativeTest() {
		movie = addMovie.insertMovies("name","time" , 1, "price");
		
		if(movie == null) {
			isNull = true;
		}
		assertNotEquals(movie,false);
	}

}
