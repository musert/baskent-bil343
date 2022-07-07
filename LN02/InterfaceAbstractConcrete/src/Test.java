
public class Test {
	public static void main(String[] args) {
		Point p = new Point(200, 300); // x, y coordinates 
		Circle c = new Circle(p, 33.3); //center, radius
		Cylinder cy = new Cylinder(55.5, 123.66); // radius, height		
		/* bad design
		System.out.println(p.toString());
		System.out.println(p.circum());
		System.out.println(p.area());
		System.out.println(p.volume());
		
		System.out.println(c.toString());
		System.out.println(c.circum());
		System.out.println(c.area());
		System.out.println(c.volume());
		
		System.out.println(cy.toString());
		System.out.println(cy.circum());
		System.out.println(cy.area());
		System.out.println(cy.volume()); */
		
		// Better design
		Shape[] s = new Shape[3]; // create 3-elements array object
		s[0] = p;
		s[1] = c;
		s[2] = cy;		
		for(int i=0; i<s.length; i++) {
			System.out.println("Object is " + s[i].getName());
			System.out.println("Object state: " + s[i].toString());
			System.out.println("Circumference of " + s[i].getName()+ ":" + s[i].circum());
			System.out.println("Area of " + s[i].getName()+ ":" + s[i].area());
			System.out.println("Volume of " + s[i].getName()+ ":" + s[i].volume());
		}		
	}
}
