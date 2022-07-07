
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		// initialize objects	
		System.out.println("Singleton created..");
	}	
	
	public synchronized static Singleton createInstance() {
		if (instance==null)
			instance = new Singleton();
		return instance;
	}
}
