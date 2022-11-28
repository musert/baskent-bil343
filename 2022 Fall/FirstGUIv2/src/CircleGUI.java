/**
 * CircleGUI.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture CircleGUI using JFrame with HasA
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-28
 */

import javax.swing.*;
import java.awt.Container; // awt: abstract windowing toolkit
import java.awt.FlowLayout;
import java.awt.event.*; // ActionListener

public class CircleGUI implements ActionListener{
	
	
	private JLabel raL, reL;
	private JTextField raTf, reTf;
	private JButton areaB, circumB, exitB;
	private JFrame gui;

	public CircleGUI() {
		/*
		 * Create GUI components
		 */
		raL = new JLabel("Radius");
		reL = new JLabel("Result");
		gui = new JFrame();
		raTf = new JTextField(20);
		reTf = new JTextField(20);
		reTf.setEditable(false);
		
		areaB = new JButton("Area");
		circumB = new JButton("Circum");
		exitB = new JButton("Exit");
		
		/*
		 * Add GUI components to container
		 */
		
		gui.setTitle("Circle App");		
		gui.setSize(299, 150);
		gui.setVisible(true);
		gui.setResizable(false);
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = gui.getContentPane();
		c.setLayout(new FlowLayout()); // set layout manager
		c.add(raL);
		c.add(raTf);
		c.add(reL);
		c.add(reTf);
		c.add(areaB);
		c.add(circumB);
		c.add(exitB);	
		
		/*
		 * Add gui component to be listened by the ActionListener
		 */		
		areaB.addActionListener(this);
		circumB.addActionListener(this);
		exitB.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		double r;
		if (e.getSource() == exitB)
			System.exit(0);
		else if (e.getSource() == areaB) {
			r = Double.parseDouble(raTf.getText()); 
			reTf.setText(String.valueOf(Math.PI*r*r)); // Math.PI*r*r + ""
		}
		else if (e.getSource() == circumB) {
			r = Double.parseDouble(raTf.getText()); 
			reTf.setText(String.valueOf(2* Math.PI*r)); // 2* Math.PI*r + ""			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		CircleGUI app = new CircleGUI();
		
	}
}