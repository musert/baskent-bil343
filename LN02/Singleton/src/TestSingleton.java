/**
 * BIL343 Object Oriented Programming w/Java
 * TestSingleton.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates Singleton class
 * 2022 Summer
 */
public class TestSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.createInstance();
		//Do not allow the following!
		Singleton s2 = Singleton.createInstance();	
	}

}
