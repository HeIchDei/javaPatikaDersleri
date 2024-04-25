import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int yaricap, alpha;
		double spesifikAlan, alan,cevre, pi=3.14;

		System.out.print("Yaricapi girin: ");
		yaricap = inp.nextInt();

		alan = pi * yaricap * yaricap;
		cevre = 2 * pi * yaricap;

		System.out.println("Dairenin alani: " + alan);
		System.out.println("Dairenin cevresi: " + cevre);

		System.out.print("Dereceyi girin: ");
		alpha = inp.nextInt();

		spesifikAlan = alan * alpha / 360;

		System.out.println("Verilen aciya gore alan: " + spesifikAlan);
		}
}