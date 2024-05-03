import java.util.Currency;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir n değeri girin: ");
		int n = scanner.nextInt();

		System.out.print("Output: ");
		meth(n);

		scanner.close();
	}

	static void meth(int originalN){
		methHelper(originalN, originalN);
	}

	static void methHelper(int originalN, int currentN){
		System.out.print(currentN + " ");

		if(currentN>0){
			methHelper(originalN, currentN-5);
		}else{
			methAddition(originalN, currentN+5);
		}

	}

	static void methAddition(int originalN, int currentN){
		System.out.print(currentN + " ");

		if(currentN < originalN){
			methAddition(originalN, currentN+5);
		}
	}


}
