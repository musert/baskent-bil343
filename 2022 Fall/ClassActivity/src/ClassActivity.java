import java.util.Scanner;
/**
 * ClassActivity.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates address comparison
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class ClassActivity {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pwd = "abCd";
		
		System.out.println("Enter password? ");
		String input = in.next(); 
		
		if(input.equalsIgnoreCase(pwd))
			System.out.println("Correct!");
		else
			System.out.println("NOT Correct!");
		
	}

}
