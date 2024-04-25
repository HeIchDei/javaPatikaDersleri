import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String username, password;

		Scanner inp = new Scanner(System.in);

		System.out.print("Kullanici adi: ");
		username = inp.nextLine();

		System.out.print("Sifre gir: ");
		password = inp.nextLine();

		if(username.equals("patika") && password.equals("java123")){
			System.out.println("Welcome!");
		}
		else{
			System.out.println("incorrect information");
		}

	}
}