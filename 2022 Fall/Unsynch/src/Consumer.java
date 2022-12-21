
public class Consumer extends Thread {
	private SharedBuffer sb;
	
	public Consumer(SharedBuffer sb) {
		super("Consumer");
		this.sb = sb;
	}
	
	
	public void run() {
		int sum=0;
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep((int)(Math.random()*4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			sum += sb.get();
		}
		System.err.println(Thread.currentThread().getName() + " reads values totaling: " + sum);
		System.err.println(Thread.currentThread().getName() + " done consuming...");
	}
}
