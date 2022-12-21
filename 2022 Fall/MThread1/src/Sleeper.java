
public class Sleeper implements Runnable {//extends Thread{
	private String name;
	private int sleepTime;
	
	public Sleeper(String name) {
		this.name = name;
		sleepTime = (int)(Math.random()*3000);
	}
	
	public void run() {
		System.err.println("Thread " + this.name + " will sleep " + this.sleepTime + "ms");
		try {
			Thread.sleep(this.sleepTime);	
		}
		catch(InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.err.println("Thread " + this.name + " done sleeping");
	}
	
	
	
}
