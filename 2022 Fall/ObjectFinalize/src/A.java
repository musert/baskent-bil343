/**
 * A.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates class finalizer
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-1
 */
public class A {
	public A() {
		/**
		 * For debug
		 */
		System.out.println("A's constructor called");
	}
	
	protected void finalize() {
		/**
		 * For debug
		 */
		System.out.println("A's finalizer called");	
	}
}
