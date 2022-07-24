/**
 * BIL343 Object Oriented Programming w/Java
 * TestException.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates exception handling
 * 2022 Summer
 */
import java.util.*;
import javax.swing.JOptionPane;

public class TestException {
	public static void main(String[] args){
		int[] ages = new int[4];
		Scanner in = new Scanner(System.in);
		int idx=0;
		
		System.out.print("Enter an array index (0-3 inclusive)? ");
		try {
			idx = in.nextInt(); // may throw InputMismatchException 
			ages[idx] = (int) (Math.random()*1000); // may throw ArrayIndexOutOfBoundsException
			System.out.println("ages[" + idx + "]= " + ages[idx]);// may throw ArrayIndexOutOfBoundsException
		}
		catch(InputMismatchException ime) {
			//JOptionPane.showMessageDialog(null, "Enter a number");
			System.err.println("Enter a number");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.err.println("Number should be btw 0-3");
		}
		finally {
			System.err.println("Always executed..;)");	
		}
		System.out.println("end main..");
	}
}
