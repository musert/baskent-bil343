public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sleeper s1 = new Sleeper("Ali");
		Sleeper s2 = new Sleeper("Veli");
		Sleeper s3 = new Sleeper("Ayse");*/
		
		Thread s1 = new Thread(new Sleeper("Ali"));
		Thread s2 = new Thread(new Sleeper("Veli"));
		Thread s3 = new Thread(new Sleeper("Ayse"));
		
		s1.start();
		s2.start();
		s3.start();
		
		System.err.println("end main..");
	}
}

