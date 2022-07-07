/**
 * BIL343 Object Oriented Programming w/Java
 * Test.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates packages
 * 2022 Summer
 */
import baskent.edu.tr.ceng.msert.bil343.lecture.*;
public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a); // call a's toString method
		System.out.println(b); // call b's toString method
		System.out.println(c); // call c's toString method
	}
}