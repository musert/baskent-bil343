import javax.swing.*;
import java.awt.*; // Container class
import java.awt.event.*;// for ActionListener interface
public class Form1 extends JFrame  {
	private JButton exit,form2;
	public Form1() {
		exit=new JButton("exit");
		form2=new JButton("form 2");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(exit);
		c.add(form2);
		
		exit.addActionListener( new ActionListener() { // anonymous inner class starts here
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		);	
		form2.addActionListener( new ActionListener() { // anonymous inner class starts here
			public void actionPerformed(ActionEvent e) {
				Form2 form2=new Form2();
				form2.setVisible(true);
			}
		}	
		);	
		setVisible(true);
		setSize(500, 500);
		setResizable(false);
		setTitle("Form 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
