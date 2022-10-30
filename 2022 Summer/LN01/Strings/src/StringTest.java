/**
 * BIL343 Object Oriented Programming w/Java
 * StringTest.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates String class
 * 2022 Summer
 */

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Ali"; // string literal-->new String("Ali")
		String s2 = new String("Veli");
		
	/*	System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2+5);
		System.out.println("Length of " + s1 + " " + s1.length());
		System.out.println("Length of " + s2 + s2.length());
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
		
		if(s1.contains("li"))
			System.out.println("true");
		else
			System.out.println("false");*/
		
		System.out.println("s1=" + s1);
		s1 = s1+s2+2022;
		System.out.println("s1=" + s1);		
	}
}