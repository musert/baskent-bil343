import javax.swing.*;
import java.awt.*; // Container, awt: abstract windowing toolkit
import java.awt.event.*; // ActionListener

public class Form2 extends JFrame {
	private JButton closeB,textB;
	private JLabel textL;
	
	
	public Form2(JLabel l) {
		
		this.textL=l;
		closeB=new JButton("Close");
		textB=new JButton("Text");
		
		setLayout(new FlowLayout());
		add(textB);
		add(closeB);
		
		textB.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textL.setText("Bora Berkan");
						//Text Button 
					}
				}
		);
	}
		public class EventHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==closeB) {
					setVisible(false);
					//Close Button
				}
				
				
			}
		}
}


