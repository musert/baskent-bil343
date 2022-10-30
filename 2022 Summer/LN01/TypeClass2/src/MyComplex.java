/**
 * BIL343 Object Oriented Programming w/Java
 * MyComplex.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */

public class MyComplex {
	private int im, re;	
	public MyComplex() {
		im = re = 0;
	}	
	public MyComplex(int re, int im) {
		this.re = re;
		this.im = im;
	}
	public MyComplex(MyComplex c) {
		this.re = c.getRe();
		this.im = c.getIm();
	}
	public MyComplex sum(MyComplex temp) {
		return new MyComplex(this.re+temp.re, this.im+temp.im);
	}
	public String toString() { // (re,im)
		return "(" + re + ", " + im + "i)";
	}

	public int getIm() {
		return im;
	}
	public void setIm(int im) {
		this.im = im;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}	
}