/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Test class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
 
import javax.swing.JButton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(234.5);
		Square s = new Square(10);
		Cylinder cy = new Cylinder(235.7,300.6);
		Shape[] shapes = new Shape[3];
		shapes[0] = c;
		shapes[1] = s;
		shapes[2] = cy;
		
		for (int i=0; i<shapes.length; i++) {
			System.out.println(shapes[i].getName() + " area = " + shapes[i].area());
			System.out.println(shapes[i].getName() + " circumference = " + shapes[i].circum());
			System.out.println(shapes[i].getName() + " volume = " + shapes[i].volume());
		}
		
		
		/*
		display(c);
		display(s);
		display(cy);
	
	
		System.out.println(c.getName() + " area = " + c.area());
		System.out.println(c.getName() + " circumference = " + c.circum());
		System.out.println(c.getName() + " volume = " + c.volume());
		
		System.out.println(s.getName() + " area = " + s.area());
		System.out.println(s.getName() + " circumference = " + s.circum());
		System.out.println(s.getName() + " volume = " + s.volume());
		
		System.out.println(cy.getName() + " area = " + cy.area());
		System.out.println(cy.getName() + " circumference = " + cy.circum());
		System.out.println(cy.getName() + " volume = " + cy.volume());
	*/
	}
	
	
	/*
	 public static void display(Shape s) {
		
		System.out.println(s.getName() + " area = " + s.area());
		System.out.println(s.getName() + " circumference = " + s.circum());
		System.out.println(s.getName() + " volume = " + s.volume());
		
	}
	
	 public static void display(Circle c) {
		
		System.out.println(c.getName() + " area = " + c.area());
		System.out.println(c.getName() + " circumference = " + c.circum());
		System.out.println(c.getName() + " volume = " + c.volume());
		
	}
	
	
	
	public static void display(Cylinder cy) {
		
		System.out.println(cy.getName() + " area = " + cy.area());
		System.out.println(cy.getName() + " circumference = " + cy.circum());
		System.out.println(cy.getName() + " volume = " + cy.volume());
		
	}

	*/

}
