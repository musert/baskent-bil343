/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Quiz 2A, Section 01
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		String[][] str = new String[2][3];
		Scanner in = new Scanner(System.in);
		for(int row=0; row<str.length; row++)
			for (int col=0; col<str[row].length; col++)
				str[row][col] = in.next();
	}
}
