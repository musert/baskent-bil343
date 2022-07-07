/**
 * BIL343 Object Oriented Programming w/Java
 * Vehicle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates inheritance
 * 2022 Summer
 */
public /*final*/ class Vehicle {//final class cannot be subclassed
	protected String model;
	protected String color;
	
	public Vehicle() {	
		model = color = ""; //null  
	}
	public Vehicle(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public String toString() {
		return "Vehicle("+model+", "+color+")";
	}
	
	public /*final*/ double fuelConsumption(double km) { // final method cannot be override by subclasses		
		return 0.0;
	}	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
}
