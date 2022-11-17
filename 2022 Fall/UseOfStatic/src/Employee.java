/**
 * Employee.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Employee type class demonstrating static members
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

import javax.swing.JOptionPane;
public class Employee {
	private int ssn;
	private String name;
	private static int count;
	
	public Employee() {
		this.ssn = -1;
		this.name = "";
		count ++;
	}

	static { // static block
		//JOptionPane.showMessageDialog(null, count);
		count = 55;
	}
	
	public Employee(int ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		count ++;
	}
	
	public String toString() {//Employee(ssn, name)
		return "Employee(" + ssn + ", " + name + ")";
	}
	
	protected  void finalize() {
		count --;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static { // static block
		count = 0;
	}
	
	public static int getCount() { // read-only 
		return count;
	}
}