
/**
 * Cylinder.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Cylinder class is a concrete class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
public class Cylinder extends ThreeDShape {
	private double r;
	private double h;
	
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}
	
	public String getName() {
		return "Cylinder";
	}
	
	public double circum() {
		return 2 * PI * r;
	}
	
	public double area() {
		return 2 * PI * r * (r+h);		
	}
	
	public double volume() {
		return PI * r * r * h;
	}	
	
	public void display() {
		
		System.out.println(this.getName() + " area = " + this.area());
		System.out.println(this.getName() + " circumference = " + this.circum());
		System.out.println(this.getName() + " volume = " + this.volume());
		
	}
}
