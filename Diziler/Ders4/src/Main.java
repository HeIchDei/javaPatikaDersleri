public class Main {
	public static void main(String[] args) {

		int[][] matris = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};

		for(int[] list: matris){
			for(int num: list){
				System.out.println(num);
			}
		}

	}
}