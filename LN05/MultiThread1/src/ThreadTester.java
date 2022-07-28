/**
 * BIL343 Object Oriented Programming w/Java
 * ThreadTester.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates Sleeper thread
 * 2022 Summer
 */
 
public class ThreadTester {
	public static void main(String[] args) {		
		/* In case of extending from the Thread class
		Sleeper s1 = new Sleeper("Ali");
		Sleeper s2 = new Sleeper("Ayse");
		Sleeper s3 = new Sleeper("Veli"); */

		// To instantiate a thread object implementing Runnable interface
		Thread s1 = new Thread (new Sleeper("Ali"));
		Thread s2 = new Thread (new Sleeper("Ayse"));
		Thread s3 = new Thread (new Sleeper("Veli"));
				
		s1.start();
		s2.start();
		s3.start();
		System.err.println("end main..");
	}
}
