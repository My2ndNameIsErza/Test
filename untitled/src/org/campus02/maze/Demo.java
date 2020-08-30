package org.campus02.maze;

public class Demo {

	public static void main(String[] args) {
		
		Maze maze = new Maze();
		System.out.println(maze.toString());
				
		MazeRunner solver = new MazeRunner(maze);
		solver.solve();
		
	}

}
