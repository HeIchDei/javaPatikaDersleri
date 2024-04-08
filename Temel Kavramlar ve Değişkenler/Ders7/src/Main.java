public class Main{
	public static void main(String[] args){

		int a=10, b=20, c=5, d;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a < b);

		System.out.println();

		boolean kosul1 = (a < b);
		boolean kosul2 = (a > c);
		boolean sonuc = kosul1 && kosul1; 	// AND
		boolean sonuc2 = kosul1 || kosul2; 	// OR
		boolean sonuc3 = !sonuc2; 			// NOT

		System.out.println(sonuc2);

		System.out.println();

		d = (a == b) ? 2 : 3;
		System.out.println(d);
	}
}