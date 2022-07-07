/**
 * BIL343 Object Oriented Programming w/Java
 * Singleton.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates Singleton class
 * 2022 Summer
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		// initialize objects	
		System.out.println("Singleton created..");
	}	
	
	public synchronized static Singleton createInstance() {
		if (instance==null)
			instance = new Singleton();
		return instance;
	}
}
