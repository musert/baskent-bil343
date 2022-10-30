import java.text.DecimalFormat;
/**
 * TestHasA.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Topic
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class TestHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat fmt = new DecimalFormat("0.000");
		
		Point p = new Point(230, 455);
		
		Circle c1 = new Circle ();
		Circle c2 = new Circle (34, 300, 500); //r, x, y
		Circle c3 = new Circle (134, p);
		
		System.out.println(p.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println("Area of circle: " + fmt.format(c2.area()));
		System.out.println("Circumference of circle: " + fmt.format(c2.circumference()));	
		
		c1 = c2 = null;
		c3 = null;
		
		System.gc(); // request garbage collector to run
		
		
		
	}

}
