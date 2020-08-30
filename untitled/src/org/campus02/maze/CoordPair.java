package org.campus02.maze;

public class CoordPair {

	public final int x;
	public final int y;
	
	public CoordPair(int x,int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "CoordPair [x=" + x + ", y=" + y + "]";
	}

}