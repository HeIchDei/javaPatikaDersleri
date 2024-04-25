import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int kenar1, kenar2;
		double hipotenus;

		Scanner inp = new Scanner(System.in);

		System.out.print("1. kenarı girin: ");
		kenar1 = inp.nextInt();

		System.out.print("2. kenarı girin: ");
		kenar2 = inp.nextInt();

		hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
		System.out.println("Hipotenus: " + hipotenus);



	}
}