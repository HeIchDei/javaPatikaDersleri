import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double ave;
		Scanner inp = new Scanner(System.in);

		System.out.print("Mat notu: ");
		mat = inp.nextInt();

		System.out.print("Fizik notu: ");
		fizik = inp.nextInt();

		System.out.print("Turkce notu: ");
		turkce = inp.nextInt();

		System.out.print("Kimya notu: ");
		kimya = inp.nextInt();

		System.out.print("Muzik notu: ");
		muzik = inp.nextInt();

		ave = (mat + fizik + turkce + kimya + muzik)/5;

		if (ave < 55){
			System.out.println("Maalesef sinifta kaldiniz!");
		} else if (ave >= 55){
			System.out.println("Tebrikler! Sinifi gectiniz!");
		}
		System.out.println("Notunuz: " + ave);

	}
}