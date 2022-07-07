
public class Cylinder extends ThreeDShape{
	private double r; // radius of cylinder
	private double h; // height of cylinder
	/*
	public final double PI = 3.14159;		
	*/
	public Cylinder() {// default constructor
		r = h = 0.0;
	}
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}
	public String toString() {
		return "Cylinder(radius="+r+", "+"height="+h+")";
	}
	public double circum() {
		return 2 * PI * r;
	}
	public double area() {
		return 2*PI*r*(r+h);
	}
	public double volume() {
		return PI*r*r*h;
	}
}
