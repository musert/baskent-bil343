
public class Producer extends Thread{
	private Buffer location;
	
	public Producer(Buffer location) {
		super("Producer");
		this.location  = location; 
	}
	
	public Producer(Buffer location, String name) {
		super(name);
		this.location  = location; 
	}
	public void run() {		
		for(int i=1; i<=4; i++) {
			try {
				Thread.sleep((int)(Math.random()*4001));
				location.set(i);
			}
			catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}
		System.err.println(this.getName() + " done producing");
		System.err.println("Terminating " + this.getName());
	}	
}