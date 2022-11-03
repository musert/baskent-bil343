/**
 * Shape.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Definition of Shape interface
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
public interface Shape {
	public final double PI = 3.14159; // only constants
	public abstract String getName(); // No method body --> abstract method
	public abstract double area();
	public abstract double circum();
	public abstract double volume();	
}
