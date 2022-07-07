
public class TestMyComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex c1 = new MyComplex(2, 3);
		MyComplex c2 = new MyComplex(-9, 4);
		// MyComplex c3 = new MyComplex(c2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("Sum of " + c1 + " and " + c2 + "= " + c1.sum(c2));

		// Exercise: Date class: day, month, year
		// Date d = new Date(29, 06, 2022)
		// d.setYear(2022).setMonth(6).setDay(29)
	}
}