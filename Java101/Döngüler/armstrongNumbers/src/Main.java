import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num, tmpNum, basNumber=0, result=0, basValue, basPow;

		System.out.print("Enter num: ");
		num = inp.nextInt();
		tmpNum = num;

		while(tmpNum != 0){
			tmpNum /= 10;
			basNumber++;
		}

		tmpNum = num;

		while(tmpNum != 0){
			basValue = tmpNum%10;
			basPow = 1;
			for(int i = 1; i <= basNumber; i++){
				basPow *= basValue;
			}
			result += basPow;

			tmpNum /= 10;
		}

		if(result == num){
			System.out.println(result + " is an armstrong number");
		}
		else{
			System.out.println(result + " is not an armstrong nubmer");
		}

	}
}