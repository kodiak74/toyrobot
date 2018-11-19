package com.binarycube.toyrobot.core;
import static org.junit.Assert.*;
import org.junit.Test;

public class TBLocation{
	@Test
 	 public void tb_Location0(){
		//public com.binarycube.toyrobot.core.Location()
		//TODO: Add constuctor test code 

	}

	@Test
 	 public void tb_Location1(){
		//public com.binarycube.toyrobot.core.Location(int,int)
		//TODO: Add constuctor test code 

	}

	@Test
 	 public void tb_toString2(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		java.lang.String res = x.toString();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_copy3(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		com.binarycube.toyrobot.core.Location res = x.copy();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_decY4(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		x.decY();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_decX5(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		x.decX();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_getX6(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		int res = x.getX();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_getY7(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		int res = x.getY();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_incX8(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		x.incX();
		 // assertNotNull(res); 
	}

	@Test
 	 public void tb_incY9(){
		//TODO: Implement method test code 

		Location x = new Location();
		 assertNotNull(x); 
		//Parameters: 
		x.incY();
		 // assertNotNull(res); 
	}

}