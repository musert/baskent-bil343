import javax.swing.JOptionPane;
/**
 * TestPoint.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Test class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		Point p2 = new Point(345,46);
				
		System.out.println("x = " + p1.getX());
		System.out.println("y = " + p1.getY());
		/*p1.setX(33);
		p1.setY(55);*/
		System.out.println("x = " + p2.getX());
		System.out.println("y = " + p2.getY());
		
		//JOptionPane.showMessageDialog(null, p1.writeName());
		System.out.println(p1.toString());
		System.out.println(p2);
	}
}