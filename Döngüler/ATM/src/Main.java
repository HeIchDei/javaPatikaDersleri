import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String userName, password;
		int tries = 3;
		int balance = 1500;
		int select;

		while(tries > 0){
			System.out.print("Username: ");
			userName = inp.nextLine();
			System.out.print("Password: ");
			password = inp.nextLine();

			if(userName.equals("hei") && password.equals("123")){
				System.out.println("Logged in.");
				do{
					System.out.println(
							"1- Deposit\n" +
									"2- Whithdraw\n" +
									"3- Balance\n" +
									"4- Exit");
					System.out.print("Choose action: ");
					select = inp.nextInt();

					if(select == 1){
						System.out.println("Balance: ");
						int price = inp.nextInt();
						balance += price;
					}else if(select == 2){
						System.out.println("Balance: ");
						int price = inp.nextInt();
						if(price > balance){
							System.out.println("Not enough balance!");
						}else{
							balance -= price;
						}

					}else if(select == 3){
						System.out.println("Your balance: " + balance);
					}

				}while(select != 4);
				break;
			}
			else{
				tries--;
				System.out.println("Invalid information!");
				if(tries == 0){
					System.out.println("Your account has blocked!");
				}else{
					System.out.println(tries + " tries left");
				}
			}

		}
	}
}