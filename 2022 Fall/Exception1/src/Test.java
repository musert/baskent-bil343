/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates exception handling
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-16
 */

import javax.swing.JOptionPane;
public class Test {
	public static void main(String[] args) {
		double c = 0.0;
		double a = 1.4;
		double b = 1.0;
		double[] arr = new double[10];
		
		String input = JOptionPane.showInputDialog("Enter number");
		
		try {
			b = Double.parseDouble(input);
			c = a/b;			
			System.out.println(c);
			arr[-1] = c;
			System.out.println("end of try..");
		}
		catch(NumberFormatException nfe) {
			// handler 
			//JOptionPane.showMessageDialog(null, "Enter a number!");
			System.out.println(nfe.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());	
		}

		/*finally { // optional
			System.out.println("Always executed...");	
		}*/		
		System.out.println("end main..");
	}
}
