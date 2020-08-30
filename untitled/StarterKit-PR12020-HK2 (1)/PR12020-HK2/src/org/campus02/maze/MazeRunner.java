package org.campus02.maze;


public class MazeRunner {

	private Maze maze;

	public MazeRunner(Maze maze) {
		this.maze = maze;
	}

	public void solve() {

		CoordPair startPos = maze.findStartPosition();
		CoordPair exitPos = maze.findExitPosition();

		if (startPos == null || exitPos == null) {
			System.err.println("error: couldn't find start and/or exit position");
			return;
		}

		System.out.println("trying to solve maze from " + startPos);

		performStep(startPos);

		System.out.println(maze);

	}

	public boolean performStep(CoordPair cp) {

		// Beispiel 2) Rekursion

		// TODO 1: check if position is the exit and return true

		// TODO 2: check if position is a wall or already visited
		//         and return false

		// TODO 3: mark position as part of the path out

		// TODO 4: start recursive calls of performStep(...)
		//         try to go in all possible directions (up,left,down,right)
		//         for this you need to create a new CoordPair object
		//         with the right coordinates for x and y
		//         x=0,y=0 is the top left corner of the maze:
		//         decrease x to go UP or increase x to go DOWN
		//         decrease y to go LEFT or increase y to go RIGHT

		boolean stepResult;

		// TODO 4a: do recursive call and try to step LEFT
		//          if the call returns true -> return true
		//          otherwise the program should continue see below 4b

		// TODO 4b: do recursive call and try to step UP
		//          if the call returns true -> return true
		//          otherwise the program should continue see below 4c

		// TODO 4c: do recursive call and try to step DOWN
		//          if the call returns true -> return true
		//          otherwise the program should continue see below 4d

		// TODO 4d: do recursive call and try to step RIGHT
		//          if the call returns true -> return true
		//          otherwise the program should continue see below 5

		//TODO 5 => 'dead end' location not part of path out
		//          unmark the position. then we 'go back'
		//          by returning false see below

		return false;

	}

}
