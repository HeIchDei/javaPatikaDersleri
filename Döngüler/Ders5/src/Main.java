import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int num;
		/*for(boolean isRun = true; isRun;){
			System.out.print("Sayi girin: ");
			num = inp.nextInt();
			if(num < 0){
				isRun = false;
			}
		}*/

		/*System.out.print("Sayi girni: ");
		num = inp.nextInt();
		while(num > 0){
			System.out.print("Sayi girni: ");
			num = inp.nextInt();
		}*/

		do{
			System.out.println("Sayi giriniz: ");
			num = inp.nextInt();
		} while(num > 0);

	}
}