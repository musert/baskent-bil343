import javax.swing.*;
import java.awt.*; // Container, awt: abstract windowing toolkit
import java.awt.event.*; // ActionListener

public class GUIThread extends JFrame implements ActionListener{
	private JLabel textL;	
	private JButton exitB, textB;	
	private Writer writerThread;
	public GUIThread() {
		/*
		 * create GUI components
		 */
		textL = new JLabel("...");
		textB = new JButton("Write");
		exitB = new JButton("Exit");
		writerThread = new Writer(textL);
		/*
		 * Add GUI components to container
		 */
		Container c =  this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(textL);
		c.add(textB);
		c.add(exitB);
		
		/*
		 * Register components to listener
		 */
		textB.addActionListener(this);
		exitB.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitB)
			System.exit(0);
		else if (e.getSource() == textB) {
			// calculate area	
			while (true)
				writerThread.start();
		}		
	}
	
	public static void main(String[] args) {
		GUIThread gui = new GUIThread();
		
		gui.setSize(300, 170);
		gui.setVisible(true);
		gui.setTitle("GUI Thread");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		
	}
	// try yourself: write inner thread class
	/*public class Writer extends Thread {
		
	}*/

}
