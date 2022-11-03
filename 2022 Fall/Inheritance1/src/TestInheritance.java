
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("XYZ");
		System.out.println(a.getName());
		System.out.println(a.speak());
		System.out.println(a.move());
		
		Cat c = new Cat("sisi");
		System.out.println(c.getName());
		System.out.println(c.speak());
		System.out.println(c.move());
		
		Dog d = new Dog("gece");
		System.out.println(d.getName());
		System.out.println(d.speak());
		System.out.println(d.move());
		
		/**
		 * Polymorphic behavior
		 */
		a = c;
		System.out.println(a.getName());
		System.out.println(a.speak());
		System.out.println(a.move());
		
	}
}
