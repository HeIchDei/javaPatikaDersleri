import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num,result=1;

		System.out.print("Enter number: ");
		num = inp.nextInt();

		for(int i = 1; i <= num; i++){
			result *= i;
		}
		System.out.println(result);

	}
}