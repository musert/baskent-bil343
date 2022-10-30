/**
 * MyComplex.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Definition of a complex number object 
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class MyComplex {
	private int re, im;
	
	public MyComplex() {
		re = im = 0;
	}
	
	public MyComplex(int re, int im) {
		this.re = re;
		this.im = im;
	}

	public MyComplex(MyComplex c) {
		this.re = c.re; // c.getRe()
		this.im = c.im; // c.getIm();		
	}
	// getters & setters
	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}

	public int getIm() {
		return im;
	}

	public void setIm(int im) {
		this.im = im;
	}
	
	public String toString() {
		return "(" + re + ", " + im + "i)"; 
	}
	
	public MyComplex sum(MyComplex c) {
		/*
		 * MyComplex temp = new MyComplex()
		 * temp.setRe(this.re + c.re);
		 * temp.setIm(this.im + c.im);
		 * return temp;
		 */
		return new MyComplex(this.re + c.re, this.im + c.im);
	}	
}