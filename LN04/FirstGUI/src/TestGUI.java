import javax.swing.*;
import java.awt.*; // Container class
import java.awt.event.*;// for ActionListener interface

public class TestGUI extends JFrame implements ActionListener{
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
		areaB.addActionListener(this);
		circumB.addActionListener(this);
		exitB.addActionListener(this);		
	}
	
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
		
	public static void main(String[] args) {
		TestGUI gui = new TestGUI();
		
		gui.setSize(300, 150);
		gui.setResizable(false);
		gui.setTitle("Circle GUI app");
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
