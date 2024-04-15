import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
		System.out.print("n1 sayisini giriniz: ");
		int n1 = inp.nextInt();
		System.out.print("n2 sayisini giriniz: ");
		int n2 = inp.nextInt();
		int min = n1>n2 ? n2:n1;
		int i=1,j=min;

		while(i<=(n1*n2)){
			if(i%n1 == 0 && i%n2 == 0){
				System.out.println(i);
				break;
			}
			i++;
		}

		while(j>=1){
			if(n1%j==0 && n2%j==0){
				System.out.println(j);
				break;
			}
			j--;
		}


	}
}