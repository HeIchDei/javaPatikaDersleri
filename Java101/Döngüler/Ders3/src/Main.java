import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int year = 2021;

		do{
			System.out.println(year);
			year++;
		}while(year < 2021);

		Scanner inp = new Scanner(System.in);

		int pass;
		boolean askPass = true;

		do{
			System.out.print("Sifre giriniz: ");
			pass = inp.nextInt();
			if(pass == 123){
				System.out.println("Dogru");
				askPass = false;
			}else{
				System.out.println("False");
			}
		}while(askPass);
	}
}