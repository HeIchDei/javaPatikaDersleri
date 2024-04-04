import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n1, n2, selection;

		Scanner inp = new Scanner(System.in);

		System.out.print("ilk sayiyi girin: ");
		n1 = inp.nextInt();

		System.out.print("ikinci sayiyi girin: ");
		n2 = inp.nextInt();

		System.out.println("1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme");
		System.out.print("Seciniz: ");
		selection = inp.nextInt();

		switch (selection){
			case 1:
				System.out.println("Sonuc: " + (n1+n2));
				break;
			case 2:
				System.out.println("Sonuc: " + (n1-n2));
				break;
			case 3:
				System.out.println("Sonuc: " + (n1*n2));
				break;
			case 4:

				if(n2 == 0){
					System.out.println("Sifira bolunemez");
				}
				else{
					System.out.println("Sonuc: " + (n1/n2));
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}

	}
}