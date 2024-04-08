import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double boy, vki;
		int kilo;

		System.out.print("Boyunuzu metre cinsinden girin: ");
		boy = inp.nextDouble();

		System.out.print("Kilonuzu girin: ");
		kilo = inp.nextInt();

		vki = kilo / (boy*boy);

		System.out.println("Vucut Kitle Indeksiniz: " + vki);

	}
}