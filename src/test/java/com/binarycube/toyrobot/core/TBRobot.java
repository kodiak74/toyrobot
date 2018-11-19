package com.binarycube.toyrobot.core;
import static org.junit.Assert.*;
import org.junit.Test;

public class TBRobot{
	
	

	@Test
 	 public void tb_placeValid(){
		Environment env = new Environment(0, 0, 10, 10);
		Robot x = new Robot("Test",env);
		assertNotNull(x); 
		Location loc = new Location(5, 5);
		x.place(loc);
		assertEquals(loc , x.getLocation());
	}

	
	@Test
	 public void tb_placeInValid(){
		Environment env = new Environment(0, 0, 10, 10);
		Robot x = new Robot("Test", env);
		assertNotNull(x); 
		Location loc = new Location(50, 50);
		x.place(loc);
		assertNotEquals(loc , x.getLocation());
	}

	
	
	
	

	@Test
 	 public void tb_moveValid(){
		Environment env = new Environment(0, 0, 10, 10);
		Robot x = new Robot("Test",env);
		assertNotNull(x); 
		Location loc = new Location(0,0);
		x.place(loc);
		x.setHeading(Heading.NORTH);
		//Parameters: 
		x.move();
		assertNotEquals(loc , x.getLocation());
	}
	
	@Test
	 public void tb_moveInValid(){
		Environment env = new Environment(0, 0, 10, 10);
		Robot x = new Robot("Test",env);
		assertNotNull(x); 
		Location loc = new Location(0,0);
		x.place(loc);
		x.setHeading(Heading.SOUTH);
		//Parameters: 
		x.move();
		assertEquals(loc , x.getLocation());
	}

	

	 

}