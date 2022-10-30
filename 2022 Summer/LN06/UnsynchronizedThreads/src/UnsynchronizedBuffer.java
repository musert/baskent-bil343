public class UnsynchronizedBuffer implements Buffer {
	private int buffer=-1;

	public void set(int val) {
		System.err.println(Thread.currentThread().getName() + " writes " + val);
		buffer = val;
	}
	public int get() {
		System.err.println(Thread.currentThread().getName() + " reads " + buffer);
		return buffer;
	}
} 