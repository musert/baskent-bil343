import javax.swing.*;
import java.awt.*; // Container class
import java.awt.event.*;// for ActionListener interface
public class Form2 extends JFrame  {
	private JButton close;
	public Form2() {
		close=new JButton("close");
	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(close);

			
		close.addActionListener( new ActionListener() { // anonymous inner class starts here
			public void actionPerformed(ActionEvent e) {				 
				setVisible(false);				
			}
		}					
		);	
		setSize(500, 500);
		setResizable(false);
		setTitle("Form 2");	
	}
}

