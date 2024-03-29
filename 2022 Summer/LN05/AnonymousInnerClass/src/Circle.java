/**
 * BIL343 Object Oriented Programming w/Java
 * Circle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */
 
public class Circle { 
	private int x;
	private int y;
	private double radius;
	
	public Circle() {
		x = y = 0;
		radius = 0.0;
	}	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.x = this.y = 0;
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
}
