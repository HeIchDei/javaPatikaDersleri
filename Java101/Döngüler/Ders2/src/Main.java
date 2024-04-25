import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int password;
		boolean isPasswordSuccess = false;


		while(!isPasswordSuccess){
			System.out.print("Sigre giriniz: ");
			password = inp.nextInt();
			if(password == 123){
				System.out.println("Dogru");
				isPasswordSuccess = true;
			}
			else{
				System.out.println("Yanlis");
			}
		}

	}
}