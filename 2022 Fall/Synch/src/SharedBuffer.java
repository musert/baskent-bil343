
public class SharedBuffer implements Buffer{
	private int val = -1;
	private boolean isWritten = false;
	
	// Synchronized method
	// We can also define synchronized statements: synchronized { ... }
	// For details, refer to at 
	// https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
	// https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
	public synchronized int get() {
		if(!isWritten) {
			try {
				System.err.println(Thread.currentThread().getName() + " tries to read. Buffer empty, wait!");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.println(Thread.currentThread().getName() + " reads " + this.val);
		isWritten = false;
		notify();
		return val;
	}
	public synchronized void set(int value) {
		if(isWritten) {
			try {
				System.err.println(Thread.currentThread().getName() + " tries to write. Buffer full, wait!");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.err.println(Thread.currentThread().getName() + " writes " + value);
		this.val = value;
		isWritten = true;
		notify();		
	}
}
