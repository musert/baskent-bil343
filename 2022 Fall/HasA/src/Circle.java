/**
 * Circle.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates has a relationship: Circle has a Point
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class Circle {
	private int r; // radius
	private Point center;
	
	public Circle() {
		r = 0;
		//center = null;
		center = new Point();
	}
	
	public Circle (int r, Point p) {
		this.r = r;
		center = p;
	}
	
	public Circle(int r, int x, int y) {
		this.r = r;
		center = new Point(x, y);
	}
	
	public double area() {
		return Math.PI * r * r;
	}
	
	public double circumference() {
		return 2 * Math.PI * r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public String toString() {
		/*return "Circle radius: " + r + "\n"
				+ "Point(" + center.getX() + ", " 
				+ center.getY() + ")";*/
		
		return "Circle radius: " + r + "\n" + center.toString();
		 
				
	}
	
		
}
