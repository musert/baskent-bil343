
public class TestArray {

	public static void main(String[] args) {
		System.out.println("Demonstrating 1D arrays");
		int[] grades = new int[3];// indices: 0, 1, 2
		grades[1] = 97;
		for(int i=0; i<grades.length; i++)
			System.out.print(grades[i] + "\t");
		
		System.out.println();
		
		// Initializing an array
		int[] ages = {10, 20, 30, 40, 50};
		for(int i=0; i<ages.length; i++)
			System.out.print(ages[i] + "\t");
		
		System.out.println("\nDemonstrating 2D arrays");
		char[][] chars = new char[2][3]; // #rows 2, #cols: 3
		chars[1][1] = 'a';
		for(int row=0; row<chars.length; row++) { //chars.length: #rows in the array
			for(int col=0; col<chars[row].length; col++) //chars[row].length: # elements in a row 
				System.out.print(chars[row][col] + "\t");
			System.out.println();
		}
		
		System.out.println();

		//Initializing 2D array
		char[][] chars2 = { {'a', 'b', 'c'}, {'d', 'e', 'f'}}; // #rows 2, #cols: 3
		for(int row=0; row<chars2.length; row++) { //chars.length: #rows in the array
			for(int col=0; col<chars2[row].length; col++) //chars[row].length: # elements in a row 
				System.out.print(chars2[row][col] + "\t");
			System.out.println();
		}
		
		System.out.println("\nDemonstrating Ragged arrays");
		
		int[][] ragged = new int[3][]; // create rows first
		ragged[0] = new int[1]; // create elements of the first row
		ragged[1] = new int[3];
		ragged[2] = new int[2];
		
		for(int row=0; row<ragged.length; row++) { 
			for(int col=0; col<ragged[row].length; col++)  
				System.out.print(ragged[row][col] + "\t");
			System.out.println();
		}
	}
}