/**
 * BIL343 Object Oriented Programming w/Java
 * DvdCollection.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates has-a, array of objects
 * 2022 Summer
 */
 
public class DvdCollection {
	private Dvd[] collection;
	private double totalCost;
	private int numElements;
	private int size;
	
	public DvdCollection() {
		this.size = 100;
		this.collection = new Dvd[size];
		this.totalCost = 0.0;
		this.numElements = 0;		
	}
	public DvdCollection(int size) {		
		this.size = size;
		this.collection = new Dvd[size];
		this.totalCost = 0.0;
		this.numElements = 0;
	}
	
	public String toString() {
		String output="DVD collection\n";
		output += numElements + " DVDs in the collection\n";
		output += "Total price:" + totalCost + "\n\n";
		for (int i=0; i<numElements; i++) 
			output += "\nDVD " + (i+1) + "\n" + collection[i].toString();
		return output;
	}
	
	public boolean addDvd(Dvd d) {
		boolean done = false;
		if (numElements <= size) {
			this.collection[numElements] = d;
			numElements++;
			totalCost += d.getPrice();
			done = true;
		}
		return done;
	}
	
	public boolean searchDvd(Dvd d) {
		boolean done = false;
		for(int i=0; i<numElements;i++) {
			if(collection[i].getTitle().equals(d.getTitle()));
				done = true;
		}
		return done;
				
			
		}
		
		
			
		
	
	
	public Dvd[] getCollection() {
		return collection;
	}
	public void setCollection(Dvd[] collection) {
		this.collection = collection;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public int getNumElements() {
		return numElements;
	}
	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
