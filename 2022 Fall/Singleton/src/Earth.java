/**
 * Earth.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Singleton class
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

public class Earth {
	private int population;
	private static Earth instance = null;

	private Earth() {
		this.population = 0;
	}
	
	public synchronized static Earth createInstance() {
		if (instance==null)
			instance = new Earth();
		return instance;
	}
}