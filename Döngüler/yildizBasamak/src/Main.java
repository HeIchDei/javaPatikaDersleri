import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Basamak sayisi: ");
		int num = inp.nextInt();

		for(int i=num; i>= 1; i--){
			for(int j=i; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}