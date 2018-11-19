package com.binarycube.toyrobot.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.binarycube.toyrobot.command.Command;
import com.binarycube.toyrobot.command.CommandParser;

/**
 * Executes the Robot application.
 * The initial implementation hard code the environment and number of robots, but could be extended to handle that if required.
 * 
 * @author chris
 *
 */
public class RobotRunner {

	private Map<String, Robot> robots = new HashMap<String,Robot>();
	
	
	public RobotRunner(String commandFile) {
	
		//5x5unit environment
		Environment env = new Environment(0, 0, 4, 4);
		Robot rb = new Robot("default",env);
		robots.put(rb.getId(), rb);

		CommandParser cp = new CommandParser();
		Map<String, List<Command>> result = cp.parseFile(commandFile);
		
		for (String rbid: result.keySet()) {
			if (robots.containsKey(rbid) ) {
				robots.get(rbid).setCommands(result.get(rbid));
			}
		}
		
	}
	
	
	public void execute() {
		for (Robot rb: robots.values()) {
			rb.doCommands();
		}
	}
	
	
	
	public static void main(String[] args) {
		 System.out.println("Working Directory = " + System.getProperty("user.dir"));
		if (args.length != 1) {
			System.out.println("Usuage: java -jar ToyRobot-0.0.1-SNAPSHOT.jar <Command file path>");
			return;
		}
		RobotRunner rr = new RobotRunner(args[0]);
		rr.execute();
		
	}

}
