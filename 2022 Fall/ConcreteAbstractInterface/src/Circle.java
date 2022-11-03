/**
 * Circle.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Circle class is a concrete class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
public class Circle extends TwoDShape{
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public String getName() {
		return "Circle";
	}
	
	public double circum() {
		return 2 * PI * r;
	}
	
	public double area() {
		return PI * r * r;		
	}
	
	public double volume() {
		return 0.0;
	}
	
	public void display() {
		
		System.out.println(this.getName() + " area = " + this.area());
		System.out.println(this.getName() + " circumference = " + this.circum());
		System.out.println(this.getName() + " volume = " + this.volume());
		
	}
}
