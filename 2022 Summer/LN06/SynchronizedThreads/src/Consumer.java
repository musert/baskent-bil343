public class Consumer extends Thread{
	private Buffer location;
	
	public Consumer(Buffer location) {
		super("Consumer");
		this.location  = location; 
	}
	
	public void run() {	
		int sum = 0;
		for(int i=1; i<=4; i++) {
			try {
				Thread.sleep((int)(Math.random()*4001));
				sum += location.get();				
			}
			catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}
		System.err.println(this.getName() + " read values totaling: " + sum + ".");
		System.err.println("Terminating " + this.getName());
	}	
}