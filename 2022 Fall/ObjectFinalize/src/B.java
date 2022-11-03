/**
 * B.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates class finalizer
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-1
 */
public class B {
	public B(){
		/**
		 * For debug
		 */
		System.out.println("B's constructor called");
	}

	protected void finalize() {
		/**
		 * For debug
		 */
		System.out.println("B's finalizer called");	
	}
}
