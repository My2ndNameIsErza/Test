package org.campus02.maze;

public class Maze {
	
	public static final char WALL_CHAR = '#';
	public static final char START_CHAR = 'S';
	public static final char EXIT_CHAR = 'E';
	public static final char VISIT_CHAR = '*';
	public static final char FREE_CHAR = ' ';
	
	private final char[][] maze = {
			{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
			{'#', ' ', ' ', 'S', '#', ' ', '#', ' ', ' ', '#'},
			{'#', ' ', '#', '#', '#', ' ', '#', '#', ' ', '#'},
			{'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
			{'#', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#'},
			{'#', '#', '#', ' ', '#', '#', ' ', ' ', ' ', '#'},
			{'#', ' ', '#', ' ', ' ', '#', '#', '#', '#', '#'},
			{'#', ' ', ' ', ' ', ' ', ' ', '#', 'E', '#', '#'},
			{'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#'},
			{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
		};
	
	@Override
	public String toString() {
		//TODO Beispiel 1a)
		return "";
	}
	
	public CoordPair findStartPosition() {
		//TODO Beispiel 1b)
		return null;
	}
	
	public CoordPair findExitPosition() {
		//TODO Beispiel 1c)
		return null;
	}
		
	public boolean isWallOrVisited(CoordPair cp) {
		if(cp.x >= maze.length || cp.y >= maze[cp.x].length)
			return false;
		return maze[cp.x][cp.y] == WALL_CHAR || maze[cp.x][cp.y] == VISIT_CHAR;
	}
	
	public boolean isExitPosition(CoordPair cp) {
		if(cp.x >= maze.length || cp.y >= maze[cp.x].length)
			return false;
		return maze[cp.x][cp.y] == EXIT_CHAR;
	}
	
	public void markPosition(CoordPair cp) {
		if(cp.x < maze.length && cp.y < maze[cp.x].length)
			maze[cp.x][cp.y] = VISIT_CHAR;
	}
	
	public void unmarkPosition(CoordPair cp) {
		if(cp.x < maze.length && cp.y < maze[cp.x].length)
			maze[cp.x][cp.y] = FREE_CHAR;
	}
}
