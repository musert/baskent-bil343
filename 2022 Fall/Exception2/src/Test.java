/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates propagating exceptions
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-16
 */

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("start main");
		try {
			m1();	
		}
		catch(Exception e) {
			System.out.println("Exception caught in main..");	
		}
		
		System.out.println("end main..");
	}
	
	public static void m1() {
		System.out.println("start m1");
		m2();
		System.out.println("end m1..");
	}
	
	public static void m2() {
		System.out.println("start m2");
		try {
			m3();
		}
		catch(NullPointerException npe) {
			System.out.println("Exception caught in m2..");	
		}
		System.out.println("end m2..");
	}

	public static void m3() {
		System.out.println("start m3");
		Scanner s = null;
		try {
			int a = s.nextInt();	
		}
		catch(NumberFormatException nfe) {
			System.out.println("Exception caught in m3..");
		}
		System.out.println("end m3..");
	}
}