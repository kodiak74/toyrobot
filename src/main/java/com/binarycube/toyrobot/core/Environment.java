package com.binarycube.toyrobot.core;

public class Environment {

	private int maxX, maxY;
	private int minX, minY;

	/**
	 * Default environment from 0,0 to 5,5
	 */
	public Environment() {
		minX = minY = 0;
		maxX = maxY = 5;
	}
	
	public Environment(int minX, int minY, int maxX, int maxY) {
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX; 
		this.maxY = maxY;
	}
	
	public int getMaxX() {
		return maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public int getMinX() {
		return minX;
	}

	public int getMinY() {
		return minY;
	}
	

	
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	public void setMinX(int minX) {
		this.minX = minX;
	}
	
	public void setMinY(int minY) {
		this.minY = minY;
	}

	
}
