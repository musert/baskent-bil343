/**
 * BIL343 Object Oriented Programming w/Java
 * TestGUI.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates named inner class
 * 2022 Summer
 */
 
import javax.swing.*;
import java.awt.*; // Container class
import java.awt.event.*;// for ActionListener interface

public class TestGUI extends JFrame {
	
	private JLabel radiusL, resultL;
	private JTextField radiusTf, resultTf;
	private JButton areaB, circumB, exitB;
	
	public TestGUI() {
		radiusL = new JLabel("Radius");
		resultL = new JLabel("Result");
		
		radiusTf = new JTextField(20);
		resultTf = new JTextField(20);
		resultTf.setEditable(false); // read-only field
		
		areaB = new JButton("Area");
		circumB = new JButton("Circumference");
		exitB = new JButton("Exit");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // define layout manager
		
		// add GUI components to container
		c.add(radiusL);
		c.add(radiusTf);
		c.add(resultL);
		c.add(resultTf);
		c.add(areaB);
		c.add(circumB);
		c.add(exitB);		

		// register GUI components to ActionListener
		MyEventHandler meh = new MyEventHandler();
		areaB.addActionListener(meh);
		circumB.addActionListener(meh);
		exitB.addActionListener( new ActionListener() { // anonymous inner class starts here
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}					
		);		
	}
		
	public static void main(String[] args) {
		TestGUI gui = new TestGUI();
		
		gui.setSize(300, 150);
		gui.setResizable(false);
		gui.setTitle("Circle GUI app");
		gui.setVisible(true);
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				//JOptionPane.showMessageDialog(null, "By default application remains in the memory");
			}
		}					
		);				
	}
	
	public class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 double radius = Double.parseDouble(radiusTf.getText());
			 Circle c = new Circle(radius);
			 
			 if (e.getSource() == areaB ) {
				 resultTf.setText(c.area()+"");
			 }
			 else if (e.getSource()==circumB) {
				 resultTf.setText(String.valueOf(c.circum()));
			 }
			 else 
				 System.exit(0);
		 }
	}
}
