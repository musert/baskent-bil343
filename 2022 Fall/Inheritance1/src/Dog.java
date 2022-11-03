
public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public String speak() {
		return this.getName() + " bark bark bark ;)"; 
	}
	
	public String move() {
		return this.getName() + " is running!"; 
	}
	
	
}
