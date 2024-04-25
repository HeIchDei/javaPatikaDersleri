public class Main {
	public static void main(String[] args) {

		int[] list = new int[5];
		int[] list2 = {1,2,3,4,5};

		int [][] matris1 = {
				{0, 453, 939, 243, 783, 891},
				{453, 0, 490, 384, 620, 439},
				{939, 490, 0, 839, 863, 423},
				{243, 384, 839, 0, 544, 823},
				{783, 620, 863, 544, 0, 1045},
				{891, 439, 423, 823, 1045, 0}
		};


		int [][] matris = new int[3][4];
		int num=1;
		for(int i=0; i < matris.length; i++){
			for(int j=0; j < matris[i].length; j++){
				matris[i][j] = num++;
			}
		}

		for(int i=0; i<matris.length; i++){
			for(int j=0; j<matris[i].length; j++){
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}


	}
}