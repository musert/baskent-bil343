/**
 * BIL343 Object Oriented Programming w/Java
 * Writer.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Thread class 
 * 2022 Summer
 */
 
import javax.swing.JLabel;

public class Writer extends Thread {
	private JLabel text;
	
	public Writer(JLabel text) {
		this.text = text;
	}
	
	public void run() {
		while(true) {
			text.setText(String.valueOf((int)(Math.random()*3001)));
		}
	}	
}
