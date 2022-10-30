// Console application that demonstrates basic IO
import java.util.Scanner; // Scanner: basic input output class

public class BasicIO {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number? "); // print()
		int num1 = in.nextInt();
		System.out.print("Enter second number? "); // print()
		int num2 = in.nextInt();		
		
		int total = sum(num1,num2);
				
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + total);
	}	
	
	public static int sum(int num1, int num2)	{
		return (num1+num2);	
	}
}