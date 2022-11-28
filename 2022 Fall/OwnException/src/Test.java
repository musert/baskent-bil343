/**
 * Test.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture Test class for our own exception class
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-21
 */

import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args) {
		PositiveNumber pn = new PositiveNumber();
		
		try {
			System.out.print("Enter a positive number? ");
			int num = pn.readPositiveNum();			
			System.out.println("You entered " + num);			
		}
		catch(NegativeNumberException nne) {
			System.out.println(nne.getMessage());
		}
		catch(InputMismatchException ime) {
			System.out.println(ime.getMessage());
		}
		
		System.out.println("end main..");
	}
}
