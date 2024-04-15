import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Bir sayi girin: ");
		int num = inp.nextInt();

		int result=0;
		boolean main=true;

		for(int i=1; i<num; i++){
			if(num%i == 0){
				result += i;
			}
		}

		System.out.println(result==num ? (num + " Mukemmmel bir sayidir") : (num + " Mukemmel sayi degildir"));

	}
}