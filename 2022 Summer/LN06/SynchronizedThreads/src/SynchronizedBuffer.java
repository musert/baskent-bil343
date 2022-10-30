public class SynchronizedBuffer implements Buffer {
	private int buffer=-1;
	private boolean isWritten = false;

	public synchronized void set(int val) {
		if (isWritten) {
			System.err.println("Buffer full, wait!");
			try {
				wait();	
			}
			catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}		
		System.err.println(Thread.currentThread().getName() + " writes " + val);
		buffer = val;
		isWritten = true;
		notifyAll();
	}
	public synchronized int get() {
		if (!isWritten) {
			System.err.println("Buffer empty, wait!");
			try {
				wait();	
			}
			catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}
		System.err.println(Thread.currentThread().getName() + " reads " + buffer);
		isWritten = false;
		notifyAll();
		return buffer;
	}
} 