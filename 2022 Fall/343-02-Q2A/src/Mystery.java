/**
 * Mystery.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Quiz 2A, Section 02
 * @author Assoc. Prof. Mustafa Sert (msert@baskent.edu.tr) | Dept. of Comp. Engr., Baskent University
 * 2022-11-14
 */

public class Mystery {
	public static void main(String[] args) {		
		int[] arr = new int[args.length];
		int k = 0;				
		for(int i=args.length-1; i>=0; i-- )
			arr[k++] = Integer.parseInt(args[i]);
		System.out.println("Elements of array 'arr' are:");
		
		for(int i=0; i<arr.length; i++ )
			System.out.println("arr[" + i + "] = " + arr[i]);
	}
}