/**
 * BIL343 Object Oriented Programming w/Java
 * Dvd.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */

public class Dvd {
	private String title;
	private String cast;
	private double price;
	
	public Dvd() {
		title = cast = "";
		price = 0.0;
	}
	
	public Dvd(String title, String cast, double price) {
		this.title = title;
		this.cast = cast;
		this.price = price;
	}
	
	public String toString() {
		return "Title: " + this.title + "\n" +
				"Cast:" + this.cast + "\n"+
				"Price: " + this.price + "\n";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
}
