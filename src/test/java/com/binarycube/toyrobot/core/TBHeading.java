package com.binarycube.toyrobot.core;
import static org.junit.Assert.*;
import org.junit.Test;

public class TBHeading{
	 
	@Test
 	 public void tb_turnRight(){
		Heading x = Heading.NORTH;
		assertNotNull(x); 
		Heading y = x.turnRight();
		assertEquals(Heading.EAST, y);
	}
	
	@Test
	 public void tb_turnLeft(){
		Heading x = Heading.NORTH;
		assertNotNull(x); 
		Heading y = x.turnLeft();
		assertEquals(Heading.WEST, y);
	}

	

	@Test
 	 public void tb_getDegrees5(){
		//TODO: Implement method test code 

		Heading x = Heading.NORTH;
		assertEquals(0, x.getDegrees());
		x = Heading.EAST;
		assertEquals(90, x.getDegrees());
		x = Heading.SOUTH;
		assertEquals(180, x.getDegrees());
		x = Heading.WEST;
		assertEquals(270, x.getDegrees());
	}

	 

}