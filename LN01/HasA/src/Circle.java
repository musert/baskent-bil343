/**
 * BIL343 Object Oriented Programming w/Java
 * Circle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */
public class Circle {
	private double radius;
	private Point center;
	
	public Circle() {
		radius = 0.0;
		center = new Point(); 
	}
	
	public Circle(int x, int y, double radius) {
		this.radius = radius;
		center = new Point(x,y);
		/*center = new Point();
		center.setX(x);
		center.setY(y);*/
	}
	
	public Circle(Point p, double radius) {
		center = p;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle center: " + center.toString() + "\n" + "Radius: " + radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	public void setCenter(int x, int y, double radius) {
		this.radius = radius;
		center.setX(x);
		center.setY(y);
	}		
	protected void finalize() {// For garbage collector house keeping
		System.out.println("Circle class finalizer called..");
	}
}
