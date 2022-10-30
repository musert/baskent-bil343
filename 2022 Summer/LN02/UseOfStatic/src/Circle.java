/**
 * BIL343 Object Oriented Programming w/Java
 * Circle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates static keyword
 * 2022 Summer
 */


public class Circle { 
	private int x;
	private int y;
	private double radius;
	private static int count=0;
	
	public Circle() {		
		x = y = 0;
		radius = 0.0;
		count++;
	}	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		count++;
	}	
	public static int getCount() {
		return count;
	}
	public int getX() { // reads value of attribute x
		return this.x; 
	}	
	public void setX(int x) { //writes to x
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	public String toString() { // Override Object's toString method
		return "Circle(x="+x+", y="+y+", radius="+radius+")";			 
	}	
	public double area() {
		return Math.PI * radius * radius;
	}	
	public double circum() {
		return 2 * Math.PI * radius; 
	}	
	protected void finalize() {//derived from the Object class and overrided here
		count--;
	}	
}
