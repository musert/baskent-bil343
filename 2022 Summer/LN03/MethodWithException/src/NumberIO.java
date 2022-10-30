/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Writing a method throwing exception
 * 2022 Summer
 */
 
import java.util.Scanner;
public class NumberIO {
	
	public int readInt() throws NegativeNumberException {
		Scanner in = new Scanner(System.in);
		int num=0;
		num = in.nextInt();
		if (num<0)
			//throw new NegativeNumberException();
			throw new NegativeNumberException("Sayi negatif olamaz");
		return num;		
	}
}
