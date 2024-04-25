import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		int sum = 0;

		do{
			System.out.print("Sayi girin: ");
			n = inp.nextInt();
			if(n%2 != 0){
				sum += n;
			}
		}while(n > 0);

		System.out.println(sum);

	}
}