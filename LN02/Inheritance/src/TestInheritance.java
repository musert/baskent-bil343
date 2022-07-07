
public class TestInheritance {

	public static void main(String[] args) {
		Vehicle v = new Vehicle("NaN","NaN");
		LandVehicle lv = new LandVehicle(4, "bmw", 2000, "red", 14.1);
		
		System.out.println(v.toString());
		System.out.println(lv.toString());
		System.out.println("LandVehicle consumption: " + lv.fuelConsumption(485)+"lt");
		

	}

}
