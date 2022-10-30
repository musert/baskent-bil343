/**
 * BIL343 Object Oriented Programming w/Java
 * NumberGenerator.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates a need for using multiple threads
 * 2022 Summer
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGenerator extends JFrame implements ActionListener{
	private JButton generate, exit;
	private JLabel text;
	public NumberGenerator() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		generate = new JButton("Generate");
		exit = new JButton("   Exit   ");
		text = new JLabel("...");
		
		c.add(generate);
		c.add(exit);
		c.add(text);
		
		generate.addActionListener(this);
		exit.addActionListener(this);
		
		setSize(300,100);
		setTitle("Random number generator");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource()==generate)
			while(true) {
				text.setText(String.valueOf((int)(Math.random()*3001)));
			}
		if (e.getSource()==exit) 
			System.exit(0);
	}
	
	public static void main(String[] args) {
		NumberGenerator gui = new NumberGenerator();
	}

}
