import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Dizideki boyutu n: ");
		int n = inp.nextInt();
		int[] list = new int[n];

		System.out.println("Dizinin elemanlarini giriniz:");
		for(int i=0; i<n; i++){
			System.out.print(i+1 + ". Elemani: ");
			list[i] = inp.nextInt();
		}

		Arrays.sort(list);

		System.out.print("Siralama: ");
		for(int i: list){
			System.out.print(i + " ");
		}



	}
}