
public abstract class TwoDShape implements Shape {
	/*
	public final double PI = 3.14159;
	public abstract double circum();
	public abstract double area();	
	*/
	public String getName() {//implemented in subclass
		return "2D shape";
	}	
	public double volume() {//implemented in subclass
		return 0.0;
	}
}
