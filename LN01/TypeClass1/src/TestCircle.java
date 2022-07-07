/**
 * BIL343 Object Oriented Programming w/Java
 * TestCircle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */

import java.text.DecimalFormat;

public class TestCircle {
	public static void main(String[] args ) {
		DecimalFormat fmt = new DecimalFormat("#.##");
		Circle c1 = new Circle();
		Circle c2 = new Circle(3, 5, 33.3);
		
		System.out.println("radius of c1: " + c1.toString());
		System.out.println("radius of c2: " + c2.toString());
		
		System.out.println("Circumference of c1: " + fmt.format(c1.circum()));
		System.out.println("Area of c1: " + fmt.format(c1.area()));
		
		System.out.println("Circumference of c2: " + fmt.format(c2.circum()));
		System.out.println("Area of c2: " + fmt.format(c2.area()));
		
		
		
	}
}
