import java.util.Scanner;

public class Main {

	static int usAlma(int a, int b){
		if(b<=0){
			return 1;
		}
		return a * usAlma(a, b-1);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Taban degeri giriniz: ");
		int base = inp.nextInt();
		System.out.print("Us degerini giriniz: ");
		int exp = inp.nextInt();

		System.out.println("Sonuc: " + usAlma(base, exp));


	}
}