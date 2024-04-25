import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num;

		System.out.print("Enter num: ");
		num = inp.nextInt();

		System.out.println("4'un kuvvetleri:");
		for(int i = 1; i <= num; i*=4){
			if(i != 1){
				System.out.println(i);
			}
		}

		System.out.println();

		System.out.println("5'in kuvvetleri:");
		for(int i = 1; i <= num; i*= 5){
			if(i != 1){
				System.out.println(i);
			}
		}

	}
}