import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int month, day;
		boolean isError = false;
		String burc = "";

		Scanner inp = new Scanner(System.in);

		System.out.print("Dogdugunuz ay: ");
		month = inp.nextInt();

		System.out.print("Dogdugunuz gun: ");
		day = inp.nextInt();

		if(month >= 1 && month <= 12){
			if(month == 1){
				if(day <= 31){
					if(day <= 21){
						burc = "Oglak";
					}
					else{
						burc = "Kova";
					}
				}else{
					isError = true;
				}
			}
			else if(month == 2){
				if(day <= 28){
					if(day <= 19){
						burc = "Kova";
					}
					else{
						burc = "Balik";
					}
				}else{
					isError = true;
				}
			}
			else if(month == 3){
				if(day <= 31){
					if(day <= 20){
						burc = "Balik";
					}
					else{
						burc = "Koc";
					}
				}else{
					isError = true;
				}
			}
			else if(month == 4){
				if(day <= 30){
					if(day <= 21){
						burc = "Koc";
					}
					else{
						burc = "Boga";
					}
				}else{
					isError = true;
				}
			}
			else{
				isError = true;
			}
		}else{
			isError = true;
		}

		if(isError){
			System.out.println("Hata!");
		}
		else{
			System.out.println("Burcunuz: " + burc);
		}

	}
}