import java.util.Scanner;
/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates reading from keyboard
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in;
		in = new Scanner(System.in);
		int num1, num2;
		// Scanner in = new Scanner(System.in);
		System.out.println("Enter first number? ");
		num1 = in.nextInt();

		System.out.println("Enter second number? ");
		num2 = in.nextInt();
		
		int total = sum(num1, num2);		
		System.out.println("Total is " + total);		
		//System.out.println("Total is " + (num1+num2));
	}
	
	public static int sum(int num1, int num2) {
		return (num1+num2);
	}
}
