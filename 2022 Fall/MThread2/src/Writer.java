import javax.swing.JLabel;
public class Writer extends Thread{
	private JLabel label;
	
	public Writer(JLabel label) {
		this.label = label;
	}
	public void run() {
		label.setText(String.valueOf(Math.random()*3000));
	}
}
