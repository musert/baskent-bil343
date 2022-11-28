/**
 * Test.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture Demonstrates propagating exceptions
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-22
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("start main..");
		try {
			m1();	
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("end main..");
	}

	public static void m1() {
		System.out.println("start m1..");
		try {
			m2();
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		System.out.println("end m1..");
	}
	
	public static void m2() {
		System.out.println("start m2..");
		try {
			m3();
		}
		catch(NullPointerException npe) {
			//System.out.println(npe.getMessage());
			npe.printStackTrace();
		}
		System.out.println("end m2..");
	}

	public static void m3() {
		System.out.println("start m3..");
		int[] arr = null;// = new int[3];
		try {
			System.out.println(arr[0]);
			arr[3] = 32492;	// exception raised here!
		}
		catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		System.out.println("end m3..");
	}
}
