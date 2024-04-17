import java.util.Scanner;

public class Main {

	static boolean isPrime(int num, int i){
		if(num == i){
			return true;
		}
		if(num%i == 0){
			return false;
		}
		return isPrime(num, i+1);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Sayi giriniz: ");
		int num = inp.nextInt();

		if(isPrime(num, 2)){
			System.out.println(num + " ASALDIR!");
		}else{
			System.out.println(num + " ASAL degildir!");
		}

	}
}