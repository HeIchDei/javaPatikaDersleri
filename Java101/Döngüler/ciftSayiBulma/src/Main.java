import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int k;

		System.out.print("Sayi giriniz: ");
		k = inp.nextInt();

		for(int i = 1; i<=k; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}


	}
}