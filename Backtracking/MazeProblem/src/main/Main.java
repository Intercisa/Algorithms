package main;

import maze.MazeProblem;

/*
 *Maze solver 
 *	
 *	It is an important problem in robotics: how to navigate a given robot
 *	For example: vacuum cleaner
 *	So again -> there are constraints // obstacles 
 *	It is like a depth-first search
 *
 *
 */

public class Main {

	public static void main(String[] args) {
		int mazeTable[][] = {
				{1,1,1,1,1},
				{1,0,0,1,0},
				{0,0,0,1,0},
				{1,1,1,1,1},
				{1,1,1,0,1}
		};
		
		MazeProblem mazeProblem = new MazeProblem(mazeTable);
		mazeProblem.solve();
		
	}
}
