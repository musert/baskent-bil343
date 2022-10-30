/**
 * BIL343 Object Oriented Programming w/Java
 * Test.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * test class
 * 2022 Summer
 */
 
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String title;
		String cast;
		double price;
		
		// create an empty dvd collection object
		DvdCollection mc = new DvdCollection();

		// reading DVD info from keyboard
		System.out.print("Movie title? ");
		title=in.nextLine();
		System.out.print("Cast? ");
		cast=in.nextLine();
		System.out.print("Price? ");
		price=in.nextDouble();
		mc.addDvd(new Dvd(title,cast,price));
			
		// Manually instantiate DVD objects	
		Dvd d1 = new Dvd("The God Father", "Marlon Brando", 23);
		Dvd d2 = new Dvd("Beautiful Mind", "Russel Crowe", 19);
		Dvd d3 = new Dvd("Pulp Fiction", "Uma Thurman", 35);
		Dvd d4 = new Dvd("Istanbul Kanatlarim Altinda", "Okan Bayülgen", 20);
		Dvd d5 = new Dvd("Aile Arasýnda", "Demet Evgar", 27);
		
		// Add DVDs to the collection		
		mc.addDvd(d1);
		mc.addDvd(d2);
		mc.addDvd(d3);
		mc.addDvd(d4);
		mc.addDvd(d5);
		
		// Display DVD collection
		System.out.println(mc.toString());
		
		// Search for a DVD
		if(mc.searchDvd(d4))
			System.out.println("DVD found.");
		else
			System.out.println("Not found");
	}
}
