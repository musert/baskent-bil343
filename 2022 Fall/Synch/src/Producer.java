
public class Producer extends Thread{
	private SharedBuffer sb;
	
	public Producer(SharedBuffer sb) {
		super("Producer");
		this.sb = sb;
	}
	
	
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep((int)(Math.random()*4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			sb.set(i);
		}
		System.err.println(Thread.currentThread().getName() + " done producing...");
	}
}
