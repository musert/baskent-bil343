
public class SharedBuffer implements Buffer{
	private int val = -1;
	
	public int get() {
		System.err.println(Thread.currentThread().getName() + " reads " + this.val);
		return val;
	}
	public void set(int value) {
		System.err.println(Thread.currentThread().getName() + " writes " + value);
		this.val = value;
	}
}
