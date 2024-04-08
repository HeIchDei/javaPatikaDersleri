import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0, tutar;
		int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

		System.out.print("Armut Kac Kilo? : ");
		armutKilo = inp.nextInt();

		System.out.print("Elma Kac Kilo? : ");
		elmaKilo = inp.nextInt();

		System.out.print("Domates Kac Kilo? : ");
		domatesKilo = inp.nextInt();

		System.out.print("Muz Kac Kilo? : ");
		muzKilo = inp.nextInt();

		System.out.print("Patlican Kac Kilo? : ");
		patlicanKilo = inp.nextInt();

		tutar = (elma*elmaKilo) + (armut*armutKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo);

		System.out.println("Toplam tutariniz: " + tutar);
	}
}