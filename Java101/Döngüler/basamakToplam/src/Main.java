import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = inp.nextInt();
		int tmpNum = num;
		int tmpNum2 = num;
		int numLen=0;
		int result = 0;

		while(tmpNum != 0){
			numLen++;
			tmpNum /= 10;
		}


		tmpNum = num;
		for(int i = 1; i <= numLen; i++){
			tmpNum2 = tmpNum;

			result += tmpNum2%10;

			tmpNum /= 10;
		}

		System.out.println(result);

	}
}