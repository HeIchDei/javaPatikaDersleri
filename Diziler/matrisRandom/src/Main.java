public class Main {
	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				matrix[i][j] = (int) Math.random() * 100;
			}
		}
	}
}