package com.binarycube.toyrobot.core;

public enum Heading {
	
   NORTH(0),  EAST (90), SOUTH(180),  WEST(270);
	
	private int degrees; //0 to 359 - in reality just with the above values;
	
	private Heading(int deg) {
		degrees = deg;
	}
	
	public int getDegrees() {
		return degrees;
	}
	
	public Heading turnRight() {
		int tmp = degrees + 90 ;
		if (tmp == 360) tmp = 0;
		return Heading.getHeading(tmp);
	}
	
	public Heading turnLeft() {
		int tmp = degrees - 90;
		if (tmp < 0) tmp = 360 + tmp;
		return Heading.getHeading(tmp);
	}
	
	public static Heading getHeading(int deg) {
		if (deg == 0) return Heading.NORTH;
		if (deg == 90) return Heading.EAST;
		if (deg == 180) return Heading.SOUTH;
		if (deg == 270) return Heading.WEST;
		return null;
	}
	
}
