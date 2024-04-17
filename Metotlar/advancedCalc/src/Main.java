import java.util.Scanner;

public class Main {

	static int sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("Toplam: " + result);
		return result;
	}

	static int minus(int n1, int n2) {
		int result = n1 - n2;
		System.out.println("Cikarma: " + result);
		return result;
	}

	static int times(int n1, int n2) {
		int result = n1 * n2;
		System.out.println("Carpma: " + result);
		return result;
	}

	static int division(int n1, int n2) {
		if (n2 == 0) {
			return 0;
		}
		int result = n1 / n2;
		System.out.println("Bolme: +" + result);
		return result;
	}

	static int pow(int n1, int n2) {
		int result = 1;
		for (int i = 1; i <= n2; i++) {
			result *= n1;
		}
		return result;
	}

	static int mod(int n1, int n2){
		return n1%n2;
	}

	static void ddg(int a, int b){
		System.out.println("Cevre: " + (2*(a+b)));
		System.out.println("Alan: " + a*b);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int choice;
		int a, b;

		String menu = "1- Toplama\n"
				+ "2- Cikarma\n"
				+ "3- Carpma\n"
				+ "4- Bolme\n"
				+ "5- Uslu Sayi Hesaplama\n"
				+ "6- Mod\n"
				+ "7- Dikdortgen Alan ve Cevre Hesabi\n"
				+ "0- Cikis";

		System.out.println(menu);
		while (true) {
			System.out.print("Seciminiz: ");
			choice = inp.nextInt();
			if (choice == 0) {
				break;
			}
			System.out.print("Bir sayi giriniz: ");
			a = inp.nextInt();
			System.out.print("Bir sayi giriniz: ");
			b = inp.nextInt();
			switch (choice) {
				case 1:
					sum(a, b);
					break;
				case 2:
					minus(a, b);
					break;
				case 3:
					times(a, b);
					break;
				case 4:
					division(a, b);
					break;
				case 5:
					System.out.println("Us hesabi: " + pow(a, b));
					break;
				case 6:
					System.out.println("Mod: "+ mod(a,b));
					break;
				case 7:
					ddg(a,b);
					break;
				default:
					System.out.println("Invalid input.");
			}


		}
		System.out.println("Bye!");
	}
}