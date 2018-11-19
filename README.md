
# Toy Robot Simulator

The application is a simulation of a toy robot moving on a square tabletop, of dimensions 5 units x 5 units.

There are no other obstructions on the table surface.  
The robot is free to roam around the surface of the table, however it is prevented from falling to destruction.  

The application reads in the following commands from the specified command file:

 - PLACE x,y,heading 
 - MOVE   
 - LEFT   
 - RIGHT  
 - REPORT

## Getting Started

Clone a copy of this repository, build the project and then execute the following.

    java -jar ToyRobot-0.0.1-SNAPSHOT.jar <Command file path>

For example:

    java -jar ToyRobot-0.0.1-SNAPSHOT.jar ../src/main/resources/commands0.txt


 ## Other notes

The test framework could be fleshed out further, with more extensive testing of each business requirement, however for expediency a smaller set was implemented, and the project tested against source input files, and walked through in debug to ensure correct behaviour. This too could have more edge cases/failure cases added to ensure a well rounded testing regime.

## Authors

Chris Thornhill



