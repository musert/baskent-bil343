/**
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Demonstrates use of arrays
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class Arrays {
	public static void main(String[] args) {
		// 1D arrays
		/*
		 * double[] ages; ages = new double[3];
		 * 
		 * for(int i=0; i<ages.length; i++) System.out.print(ages[i] + "\t");
		 */

		// 2D arrays

		/*
		 * int[][] image = new int[2][3]; for(int row=0; row<image.length; row++) {
		 * for(int col=0; col<image[row].length; col++) System.out.print(image[row][col]
		 * + "\t"); System.out.println(); }
		 */

		// Ragged arrays

		int[][] ragged = new int[3][];
		ragged[0] = new int[2];
		ragged[1] = new int[1];
		ragged[2] = new int[3];

		for (int row = 0; row < ragged.length; row++) {
			for (int col = 0; col < ragged[row].length; col++)
				System.out.print(ragged[row][col] + "\t");
			System.out.println();
		}

	}

}
