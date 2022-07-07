/**
 * BIL343 Object Oriented Programming w/Java
 * LandVehicle.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates inheritance
 * 2022 Summer
 */

public class LandVehicle extends Vehicle {
	// implicitly derived attributes: model, color
	private int numWheel;
	private int enginePower;
	private double avgConsumption;
	
	public LandVehicle() {
		//super(); // implicit call to super class constructor
		//color = model = "";
		numWheel = enginePower= 0;
		avgConsumption = 0.0;	
	}
	
	public LandVehicle(int numWheel, String model, int enginePower, String color, double avgConsumption) {		
		/*this.model = model;
		this.color = color;*/
		super(model, color);
		this.numWheel = numWheel;
		this.enginePower = enginePower;		
		this.avgConsumption = avgConsumption;		
	}	
	public String toString() {
		return "LandVehicle:\n" + 
				super.toString() + "\n"
				+"Engine power: " + enginePower+"\n"+
				"Average consumption: "+avgConsumption+"\n"+
				"Number of wheels: " + numWheel;
	}
	public double fuelConsumption(double km) {
		return (avgConsumption*km)/100;
	}
}
