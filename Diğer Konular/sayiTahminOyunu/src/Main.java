import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(100);

		Scanner inp = new Scanner(System.in);

		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;

		while (right < 5) {
			System.out.print("Tahmin gir: ");
			selected = inp.nextInt();

			if (selected < 0 || selected > 100) {
				System.out.println("0-100 arasinda bir deger giriniz.");
				if(!isWrong){
					isWrong = true;
					System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
				}else{
					System.out.println("Cok fazla hatali giris yaptiniz, kalan hak: " + (5 - (right++)));
				}
				continue;
			}

			if (selected == number) {
				System.out.println("Tebrikler, dogru tahmin!");
				isWin = true;
				break;
			}
			else {
				wrong[right++] = selected;
				System.out.println("Kalan hak: " + (5 - right));
				if (selected > number) {
					System.out.println("go lower");
				}
				else {
					System.out.println("go higher");
				}
			}
		}


		if (!isWin && !isWrong) {
			System.out.println("You lose :c");
			System.out.println("Your guesses: " + Arrays.toString(wrong));
		}
		else {
			System.out.println("You won!");

		}
	}
}