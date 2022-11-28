/**
 * NegativeNumberException.java
 * @course BIL343 Object Oriented Programming w/Java
 * @lecture Own exception (type) class
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-21
 */
public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("Number cannot be negative!");
	}
	public NegativeNumberException(String msg) {
		super(msg);
	}	
}
