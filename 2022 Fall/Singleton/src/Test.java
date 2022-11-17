/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Test class
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

public class Test {
	public static void main(String[] args) {
		Earth e1 = Earth.createInstance();
		Earth e2 = Earth.createInstance();
		
		System.out.println(e1.toString());		
		System.out.println(e2.toString());
		

	}

}
