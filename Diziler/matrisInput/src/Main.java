import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		Scanner inp = new Scanner(System.in);

		for(int i=0; i < matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print("Enter digit: ");
				matrix[i][j] = inp.nextInt();
			}
		}

	}
}