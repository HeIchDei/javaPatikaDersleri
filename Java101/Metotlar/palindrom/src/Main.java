import java.util.Scanner;

public class Main {

	static boolean isPalindrom(int num){

		int tmp = num, revNum = 0, lastNum;

		while(tmp != 0){
			lastNum = tmp%10;
			revNum = (revNum*10) + lastNum;
			tmp /= 10;
		}

		if(num == revNum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		if(isPalindrom(121)){
			System.out.println("Palindrom");
		}else{
			System.out.println("Degil");
		}

	}
}