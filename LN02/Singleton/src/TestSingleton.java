
public class TestSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.createInstance();
		//Do not allow the following!
		Singleton s2 = Singleton.createInstance();	
	}

}
