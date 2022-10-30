/**
 * Point.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Definition of a point object
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class Point {
	private int x, y;
	
	public Point() { // default constructor
		x = y = 0;
	}
	
	public Point(int x, int y) { //parameter constructor
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	
/*	public String writeName() {
		return "Point";
	}*/
	
	public String toString() {
		return "Point(" + this.x + ", " + this.y + ")";
	}
	
}
