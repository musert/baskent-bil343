
public class TestStatic {

	public static void main(String[] args) {
		//System.out.println("Count = " + Circle.getCount());
		Circle c1 = new Circle();
		Circle c2 = new Circle(200, 300, 45.7);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//System.out.println("Count = " + c1.getCount());
		//System.out.println("Count = " + c2.getCount());
		System.out.println("Count = " + Circle.getCount());
		
		c2 = null;
		
		System.gc();
		
		System.out.println("Count = " + Circle.getCount());
		// below lines are for delay purpose.
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
		System.out.println("Count = " + Circle.getCount());
	}
}
