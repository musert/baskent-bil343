/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates use of own exception class
 * 2022 Summer
 */
 
public class Test {
	public static void main(String[] args) {
		NumberIO in = new NumberIO();		
		int num=0;
		try {
			System.out.println("Enter a number? ");
			num = in.readInt();
			System.out.println("You entered " + num);			
		}
		catch(NegativeNumberException nne) {
			System.out.println("Exception occured: " + nne.getMessage());
		}		
		System.out.println("End main..");
	}
}
