/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates how exception handling can be deferred
 * 2022 Summer
 */

import javax.swing.JOptionPane;

public class TestException {
	public static void main(String[] args) {
		System.out.println("Start main..");
		try {
			m1();	
		}
		catch(Exception ex) {
			//System.out.println("Exception caught in main: En error occured ;)");
			ex.printStackTrace();
		}		
		System.out.println("End main..");
	}
	
	public static void m1() {
		System.out.println("Start m1..");
	//	try {
			m2();	
	//	}
	/*	catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}*/		
		System.out.println("End m1..");		
	}
	public static void m2() {
		int a = 0;
		System.out.println("Start m2..");
		m3();
		if (a==0) throw new ArithmeticException();
		System.out.println("End m2..");		
	}
	public static void m3() {
		System.out.println("Start m3..");
		int a = 0, b=0;		
		try {
			a = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1?"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2?"));			
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		JOptionPane.showMessageDialog(null, "Sum is " + (a+b), "Result", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("End m3..");		
	}
}
