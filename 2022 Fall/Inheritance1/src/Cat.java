public class Cat extends Animal{
	// name, speak(), getName(), move() are derived/inherited
	public Cat() {
		super(); // explicit call to the super class default constructor
	}
	public Cat(String name) {
		super(name); // call to the superclass's constructor		
		// this.name = name;
	}
	
	public String speak() {
		//return super.speak(); // call to super class version of the speak method
		return this.getName() + " meow meow meow"; 
	}
	
	public String move() {
		return this.getName() + " is walking silently..."; 
	}
	
}