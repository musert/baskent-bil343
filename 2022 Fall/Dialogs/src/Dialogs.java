import javax.swing.JOptionPane;
/**
 * Dialogs.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates use of dialog boxes for input and output
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class Dialogs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		String input1, input2;
		
		input1 = JOptionPane.showInputDialog("Enter 1st number? ");
		input2 = JOptionPane.showInputDialog("Enter 2nd number? ");
		
		int total = Integer.parseInt(input1) + Integer.parseInt(input2) ; // Type wrapper classes
		
		JOptionPane.showMessageDialog(null, "Total is " + total, "Result", JOptionPane.ERROR_MESSAGE);
	}
}