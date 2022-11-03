
public class Animal {
	private String name;
	
	public Animal() {
		this.name = "";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String speak() {
		return this.getName() + " speaks like animal..."; 
	}
	
	public String move() {
		return this.getName() + " moves like animal..."; 
	}

	public String getName() {
		return this.name;
	}

}
