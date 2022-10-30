/**
 * BIL343 Object Oriented Programming w/Java
 * Sleeper.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Thread class
 * 2022 Summer
 */
 
public class Sleeper implements Runnable { //extends Thread{
	private String name;
	private int sleepTime;
	
	public Sleeper(String name) {
		this.name = name;
		this.sleepTime = (int) (Math.random()*3001);
	}
	
	public void run() { // thread's job
		System.err.println("Thread " + name + " going to sleep " + sleepTime + "ms");
		try {
			Thread.sleep(sleepTime);
		}
		catch(InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.err.println("Thread " + name + " done sleeping..");		
	}
}
