package com.binarycube.toyrobot.command;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TBCommandParser{
	@Test
 	 public void tb_CommandParser(){
		//public com.binarycube.toyrobot.command.CommandParser()
		CommandParser cp = new CommandParser();
		Map<String, List<Command>> result = cp.parseFile("src/main/resources/commands0.txt");
		assertTrue(result.containsKey("default")); 
		
		List<Command> commands = result.get("default");
		assertEquals(commands.size(), 3);
		
		//And further tests to validate commands, and further methods to handle parse failure sceanrios
		
	}

}