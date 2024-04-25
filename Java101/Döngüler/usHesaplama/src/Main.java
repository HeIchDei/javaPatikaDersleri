import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);

	int num, power;
	double result=1;

		System.out.print("Enter number: ");
		num = inp.nextInt();
		System.out.print("Enter power: ");
		power = inp.nextInt();

		for(int i=1; i<=power; i++){
			result *= num;
		}

		System.out.println(result);

	}
}