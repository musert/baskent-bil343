/**
 * PositiveNumber.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture Demonstrating a method throws an exception
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-21
 */

import java.util.Scanner;
public class PositiveNumber {
	
	public int readPositiveNum() throws NegativeNumberException{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		/* raising an exception for demonstration */
		if(num<0) // raise an exception
			throw new NegativeNumberException();
		return num;
	}
}
