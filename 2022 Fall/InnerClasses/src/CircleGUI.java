import javax.swing.*;
import java.awt.*; // Container, awt: abstract windowing toolkit
import java.awt.event.*; // ActionListener

public class CircleGUI extends JFrame{
	private JLabel raL, reL;
	private JTextField raTf, reTf;
	private JButton exitB, areaB, circumB;	

	public CircleGUI() {
		/*
		 * create GUI components
		 */
		raL = new JLabel("Radius");
		reL = new JLabel("Result");
		raTf = new JTextField(20);
		reTf = new JTextField(20);
		reTf.setEditable(false);
		areaB = new JButton("Area");
		circumB = new JButton("Circumference");
		exitB = new JButton("Exit");
		/*
		 * Add GUI components to container
		 */
		Container c =  this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(raL);
		c.add(raTf);
		c.add(reL);
		c.add(reTf);
		c.add(areaB);
		c.add(circumB);
		c.add(exitB);
		
		/*
		 * Register components to listener
		 */
		MyEventHandler meh = new MyEventHandler();
		
		areaB.addActionListener(meh);
		circumB.addActionListener(
				new ActionListener() { // anonymous inner class starts here
					public void actionPerformed(ActionEvent e) {
						reTf.setText(String.valueOf(Double.parseDouble(raTf.getText())*2*Math.PI));
					}
				}
		);
		exitB.addActionListener(meh);		
	}	
	
	public static void main(String[] args) {
		CircleGUI gui = new CircleGUI();
		
		gui.setSize(300, 170);
		gui.setVisible(true);
		gui.setTitle("Circle application");
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		
		gui.addWindowListener(
				new WindowAdapter() {
				    public void windowClosing(WindowEvent e) {
				    	System.exit(JFrame.EXIT_ON_CLOSE);
				    }
				}
				
		);		
	}
	/*
	 * Named inner class
	 */
	public class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == exitB)
				System.exit(0);
			else if (e.getSource() == areaB) {
				// calculate area	
				reTf.setText(String.valueOf(Double.parseDouble(raTf.getText())*Double.parseDouble(raTf.getText())*Math.PI));
			}
		}
	}
}
