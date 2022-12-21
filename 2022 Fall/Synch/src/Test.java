
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBuffer sb = new SharedBuffer();
		Producer p = new Producer(sb);
		Consumer c = new Consumer(sb);
		
		p.start();
		c.start();
		System.err.println("end main..");

	}

}
