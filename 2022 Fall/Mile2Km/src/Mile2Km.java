/**Mile2Km.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture GUI application demonstrating mile to km conversion
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-28
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Mile2Km extends JFrame implements ActionListener{
	private JLabel milLabel ,kmLabel;
	private JTextField milField, kmField ;
	private JButton convertButton; 
	
	public Mile2Km() {
		milLabel = new JLabel("mile");
		kmLabel = new JLabel("Km");
		milField = new JTextField(10);
		kmField = new JTextField(10);
		convertButton = new JButton(">>");	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(milField);
		c.add(milLabel);		
		c.add(convertButton);		
		c.add(kmField);	
		c.add(kmLabel);
		convertButton.addActionListener(this);
		
	}	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == convertButton) {
			kmField.setText(String.valueOf
			(Double.parseDouble(milField.getText())*1.609));
		}
	}
	public static void main(String[] args) {
		Mile2Km app = new Mile2Km();
		app.setVisible(true);
		app.setSize(500,100);
		app.setResizable(false);
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
}