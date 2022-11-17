/**
 * Test.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Test class for Employee
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

import javax.swing.JOptionPane;
public class Test {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "count= " + Employee.getCount());
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "ali");
		Employee e2 = new Employee(103, "veli");
		Employee e3 = new Employee(105, "ayse");
		
		
		String output = e1.toString() + "\ncount: " + e1.getCount() + "\n\n" +
				e2.toString() + "\ncount: " + e2.getCount() + "\n\n" + 
				e3.toString() + "\ncount: " + e3.getCount();
		
		JOptionPane.showMessageDialog(null, output);
		/*JOptionPane.showMessageDialog(null, e2.toString() + "\ncount: " + e2.getCount());
		JOptionPane.showMessageDialog(null, e3.toString() + "\ncount: " + e3.getCount());*/		
		
		e2 = null;
		System.gc();
		
		JOptionPane.showMessageDialog(null, "count= " + Employee.getCount());
		JOptionPane.showMessageDialog(null, "count= " + Employee.getCount());
	}

}
