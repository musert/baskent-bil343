
public class SharedBufferTest {

	public static void main(String[] args) {
		Buffer buffer = new UnsynchronizedBuffer();
		
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
		
		p.start();
		c.start();
	}
}
