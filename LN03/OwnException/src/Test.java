/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates use of own exception class
 * 2022 Summer
 */
 import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=0;
		try {
			System.out.println("Enter a number? ");
			num = in.nextInt();
			
			// To declare when this exception raises
			if (num < 0)
				throw new NegativeNumberException();
			else
				System.out.println("You entered " + num);			
		}
		catch(NegativeNumberException nne) {
			System.out.println("Exception occured: " + nne.getMessage());
		}
		
		System.out.println("End main..");
	}
}
