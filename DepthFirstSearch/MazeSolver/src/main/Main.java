package main;

import maze.FileReader;
import maze.MazeSolver;

/*
 */

public class Main {

	public static void main(String[] args) {
	
		
		FileReader fileReader = 
				new FileReader("C:\\Users\\sipic\\projects\\GIT\\Algorithms\\DepthFirstSearch\\MazeSolver\\map.txt", 6, 6);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionCol(),fileReader.getStartPositionRow());
		mazeSolver.findWayOut();
		
		
		
	}
}