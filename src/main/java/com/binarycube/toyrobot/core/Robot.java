package com.binarycube.toyrobot.core;

import java.util.ArrayList;
import java.util.List;

import com.binarycube.toyrobot.command.Command;
import com.binarycube.toyrobot.command.CommandType;

/**
 * Core class of the Toy Robot simulator.
 * Handles the business logic of what the robot can and cant do in its environment.
 * 
 * @author chris
 *
 */
public class Robot {

	private String id = "default";
	
	private Heading heading;
	private Location location;
	private Environment environment;

    private List<Command> commands;

	
	public Robot(String id, Environment env) {
		commands = new ArrayList<Command>();
		this.environment = env;
		if (id != null) this.id = id; 
	}
	
	
	
	public String getId() {
		return id;
	}

	 









	/**
	 * Move 1 unit in the current heading,
	 * and update the location accoridngly;
	 */
	public void move() {
		if (environment == null) return; //Ignore if not on a table
		if (location == null) return;
		if (heading == null) return;
		
		Location lookAhead = location.copy();
		if (heading == Heading.NORTH) lookAhead.incY();
		if (heading == Heading.EAST) lookAhead.incX();
		if (heading == Heading.SOUTH) lookAhead.decY();
		if (heading == Heading.WEST) lookAhead.decX();
		if (validatePosition(lookAhead)) this.location = lookAhead;
	}
	
	
	public void place(int x, int y) {
		if (environment == null) return; //Ignore if not on a table
		Location lookAhead = new Location(x, y);
		this.place(lookAhead);
	}
	
	public void place(Location loc) {
		if (environment == null) return; //Ignore if not on a table
		if (validatePosition(loc)) this.location = loc;
	}
	
	/**
	 * Check if position falls within the environment bounds;
	 */
	boolean validatePosition(Location loc) {
		if (loc.getX() < environment.getMinX()) return false;
		if (loc.getX() > environment.getMaxX()) return false;
		
		if (loc.getY() < environment.getMinY()) return false;
		if (loc.getY() > environment.getMaxY()) return false;
		
		return true;
	}
	
	public void setHeading(Heading x) {
		if (x != null) this.heading = x;
	}
	 
	
	public void performCommand(Command com) {
		if (com.getType() == CommandType.LEFT) heading = heading.turnLeft();
		if (com.getType() == CommandType.RIGHT) heading = heading.turnRight();
		if (com.getType() == CommandType.MOVE)	this.move();
		if (com.getType() == CommandType.REPORT) System.out.println(this.toString());	
		if (com.getType() == CommandType.PLACE) {
			Heading head = Heading.valueOf(com.getParam(2));
			int x = com.getParamAsInt(0);
			int y = com.getParamAsInt(1);
			this.heading = head;
			this.place(x, y);
		}
		
	}
	
	public Location getLocation() {
		return location;
	}
	
	
	public String toString() {
		StringBuilder buffer= new StringBuilder("Report for Robot[");
		buffer.append(id).append("]: ");
		if (location != null) buffer.append(location.toString());
		buffer.append(",");
		if (heading != null) buffer.append(heading.toString());
		return buffer.toString();
	}

 
	
	/**
	 * Run through the commands in the command queue .
	 * Must place the robot for commands to be executed.
	 */
	public void doCommands() {
		boolean beenPlaced = false;
		for (Command com : commands) {
			if ((com.getType() == CommandType.PLACE)  || (beenPlaced)) {
				this.performCommand(com);
				if (!beenPlaced) beenPlaced = true;
			}
		}
		
	}
	
	
	public void add(Command com) {
		commands.add(com);
	}



	public void setCommands(List<Command> x) {
		commands = x;
		
	}
	
}
