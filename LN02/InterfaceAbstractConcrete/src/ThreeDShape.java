/**
 * BIL343 Object Oriented Programming w/Java
 * ThreeDShape.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates interface-abstract-concrete class
 * 2022 Summer
 */
public abstract class ThreeDShape implements Shape{
	/*
	public final double PI = 3.14159;
	public abstract double circum();
	public abstract double area();
	public abstract double volume();	
	*/
	public String getName() {//implemented in subclass
		return "3D shape";
	}	
}
