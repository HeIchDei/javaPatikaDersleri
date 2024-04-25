import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int fiyat; //no kdv
		double kdvOrani, kdvliFiyat;

		System.out.print("Fiyat girin: ");
		fiyat = inp.nextInt();

		kdvOrani = fiyat >= 1000 ? 0.08 : 0.18;

		kdvliFiyat = fiyat + (fiyat*kdvOrani);

		System.out.println("KDV'siz fiyat = " + fiyat);
		System.out.println("KDV'li fiyat = " + kdvliFiyat);
		System.out.println("KDV tutrai = " + fiyat*kdvOrani);
	}
}