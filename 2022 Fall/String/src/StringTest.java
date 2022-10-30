/**
 * StringTest.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture String (immutable) concatenation.
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-10-30
 */
public class StringTest {

	public static void main(String[] args) {

		//System.out.println("Toplam= " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
		String s1 = "BIL343";
		String s2 = "OOP";
		int year = 2022;
		String s3 = "";

		s3 = s1+ " - " + s2;
		
		System.out.println(s3 + year);	
		
	}
}