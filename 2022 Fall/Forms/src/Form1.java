import javax.swing.*;
import java.awt.*; // Container, awt: abstract windowing toolkit
import java.awt.event.*; // ActionListener

public class Form1 extends JFrame {
	private JLabel textL;
	private JButton form2B;	
	
	
	public Form1() {
		
		textL=new JLabel("...");
		form2B=new JButton("Form 2");
		
		setLayout(new FlowLayout());
		add(form2B);
		add(textL);
		
		form2B.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						// Call Form 2
					}
				}
		);
		//.
	}
}


