/**
 * TestComplex.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Test class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex c1 = new MyComplex(); // 0+0i
		MyComplex c2 = new MyComplex(3, 5); // 3+5i
		MyComplex c3 = new MyComplex(c2);
		MyComplex c4 = new MyComplex(-2, 23); // 3+5i
		
		
		MyComplex total = c4.sum(c3); // add c3 to c2 and return
									  // a new complex number
		
		System.out.println("Sum of " + c4.toString() + " and "
				+ c3.toString() + " is " + total.toString());

	}

}
