import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number N");
		int num = inp.nextInt();
		String space;
		String star;
		String result="";

		for(int i=1; i<=num; i++){
			space = "";
			for(int j=1; j<=(num-i); j++){
				space += " ";
			}

			star = "";
			for(int j=1; j<=((i*2)-1); j++){
				star += "*";
			}
			result += space+star + "\n";

		}
		System.out.println(result);

	}
}