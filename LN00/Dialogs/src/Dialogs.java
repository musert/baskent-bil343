import javax.swing.JOptionPane;

public class Dialogs {
	public static void main(String[] arg) {
		int num1, num2;
		String s1, s2;
		
		s1 = JOptionPane.showInputDialog("Enter first number? ");
		s2 = JOptionPane.showInputDialog("Enter second number? ");
		
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s2);
		
		int total = sum(num1,num2);
		
		JOptionPane.showMessageDialog(null, "The sum is " + total, "Result of summation", JOptionPane.PLAIN_MESSAGE);                                 
		
	}	
	
	public static int sum(int num1, int num2)	{
		return (num1+num2);	
	}

}
