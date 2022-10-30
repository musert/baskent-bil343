
public class SharedBufferTest {

	public static void main(String[] args) {
		Buffer buffer = new SynchronizedBuffer();
		
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
		
		Producer p2 = new Producer(buffer, "Producer2");
		
		p.start();
		p2.start();
		c.start();
	}
}
