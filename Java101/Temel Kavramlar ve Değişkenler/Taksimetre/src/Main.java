import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int km;
		double fiyat;

		System.out.print("Gittiginiz mesafeyi girin: ");
		km = inp.nextInt();

		fiyat = 10 + (2.2 * km);

		System.out.println("Odeyeceginiz ucret: " + (fiyat>=20 ? fiyat : 20));
	}
}