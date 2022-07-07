/**
 * BIL343 Object Oriented Programming w/Java
 * TestInheritance.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates inheritance
 * 2022 Summer
 */

public class TestInheritance {

	public static void main(String[] args) {
		Vehicle v = new Vehicle("NaN","NaN");
		LandVehicle lv = new LandVehicle(4, "bmw", 2000, "red", 14.1);
		
		System.out.println(v.toString());
		System.out.println(lv.toString());
		System.out.println("LandVehicle consumption: " + lv.fuelConsumption(485)+"lt");
		

	}

}
