package wrapper;

public class Main {
	public static void main(String[] args) {
		/*int b = 20;
		Integer a = 30;
		String str = "abc";
		Short s = 2;*/

		/*String a = "10";
		int b = 20;
		int c = Integer.parseInt(a);
		System.out.println(c + b);
		System.out.println(Integer.max(c,b));
		System.out.println(Integer.sum(b,c));*/



		int a = 10;

		// Autoboxing
		Integer b = a;

		// Boxing
		Integer c = Integer.valueOf(a);

		// Auto-Unboxing
		int d = c;

		// Unboxing
		int i = c.intValue();


	}
}
