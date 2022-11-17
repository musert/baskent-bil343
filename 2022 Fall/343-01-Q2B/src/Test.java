/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Quiz 2B, Section 01
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

import javax.swing.JOptionPane;
public class Test {
	public static void main(String[] args) {
		String[][] str = new String[3][];
		str[0] = new String[1];
		str[1] = new String[3];
		str[2] = new String[2];
		
		for(int row=0; row<str.length; row++)
			for (int col=0; col<str[row].length; col++)
				str[row][col] = JOptionPane.showInputDialog("Enter strings");
	}
}
