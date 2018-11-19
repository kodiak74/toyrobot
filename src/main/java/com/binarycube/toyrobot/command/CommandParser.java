package com.binarycube.toyrobot.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles the parsing of commands.
 * 
 * @author chris
 *
 */
public class CommandParser {


	public CommandParser() {
		
	}
	
	
	public Map<String, List<Command>> parseFile(String path) {
		Map<String, List<Command>> result = new HashMap<String, List<Command>>();
		String currentRobot= "default";
		try {
			List<String> lines = Files.readAllLines(Paths.get(path));
			
			for (String line: lines) {
				//Can extend to ignore comment lines, and to handle multiple robots ...
				if ((line != null) && (!line.equals(""))) {
					Command cmd = parseCommand(line);
					List<Command> robotCommands = result.get(currentRobot);
					if (robotCommands == null) robotCommands = new ArrayList<Command>();
					robotCommands.add(cmd);
					result.put(currentRobot, robotCommands);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block - should integrate with logging framework
			System.out.println("Error processing command file");
			e.printStackTrace();
		}
		return result;
	}
	
	
	Command parseCommand(String src) {
		if (src == null) return null;
		String[] bits = src.split("[ ,]+");
		CommandType ct = CommandType.valueOf(bits[0]);
		if (ct != null) {
			String[] params = Arrays.copyOfRange(bits,1,bits.length);
			return new Command(ct, params);
		}
		return null;
	}
	
}
