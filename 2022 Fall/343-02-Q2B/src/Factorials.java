/**
 * Factorials.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Quiz 2B, Section 02
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

public class Factorials {
	public static void main(String[] args) {		
		
		for(int i=0; i< args.length; i++) {
			int num = Integer.parseInt(args[i]);
			int f = 1;
			for (int k=1; k<=num; k++)
				f = f*k;			
			System.out.println("Factorial of " + args[i] + " is " + f + "\n");
		}			
	}
}