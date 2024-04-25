import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac tane sayi gireceksiniz: ");
		int numLen = inp.nextInt();
		int max=0,min=0;
		int tmp;

		for(int i=1; i<=numLen; i++){
			System.out.print(i + ". Sayiyi girin: ");
			tmp = inp.nextInt();
			if(max <= tmp){
				max = tmp;
			}
			if(min >= tmp){
				min = tmp;
			}

		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);

	}
}