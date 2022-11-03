/**
 * Square.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Square is a concrete class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
public class Square extends TwoDShape{
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public String getName() {
		return "Square";
	}
	
	public double circum() {
		return 4 * side;
	}
	
	public double area() {
		return side * side;		
	}
	
	public double volume() {
		return 0.0;
	}	
	
	
}
