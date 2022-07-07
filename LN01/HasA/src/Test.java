 
public class Test extends Object {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		Point p = new Point(100, 200);	
		Circle c1 = new Circle(); // default constructor
		Circle c2 = new Circle(200, 300, 35.3);// x, y, radius
		Circle c3 = new Circle(p, 45.33);// center coordinate as a point, radius
		
		// display object attributes
		System.out.println(p.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		c3.setCenter(700, 1300, 12.76);
		
		System.out.println(c3.toString());
		
		System.out.println(p.toString());
		
		c1 = c2 = null;
		
		System.gc();//force to run the garbage collector
		
		
		
	}
	
}
