package com.binarycube.toyrobot.core;

public class Location {
	private int x,y;

	public Location() {
		x = 0;
		y = 0;
	}
	
	public Location(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public Location copy() {
		return new Location(this.x, this.y);
	}

	public void incY() {
		y++;
		
	}

	public void incX() {
		x++;
		
	}

	public void decY() {
		y--;
		
	}

	public void decX() {
		x--;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		return x + "," + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Location) {
			Location toTest = (Location) obj;
			if ((toTest.getX() == this.x) && (toTest.getY() == this.y)) return true;
		}
		return false;
	}
	
	
	
	
}
