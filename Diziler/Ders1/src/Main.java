public class Main {

	static void printArray(int[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	static void printArray(double[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	static int[] reverse(int[] arr){
		int[] reverse = new int[arr.length];
		for(int i=0, j=arr.length-1; i<arr.length; i++,j--){
			reverse[i] = arr[j];
		}

		return reverse;

	}

	public static void main(String[] args) {
		//int list2[] = new int[20];

		int[] list = new int[10];

		for(int i=0; i < list.length; i++){
			list[i] = (i * 10) + 10;
			//System.out.println(list[i]);
		}

		//System.out.println("=======================");

		int[] list2 = {10,20,30,40,50,60,70,80,90,100};


		for(int i=0; i<list2.length; i++){
			//System.out.println(list[i]);
		}

		//System.out.println("=======================");

		//printArray(list2);

		double[] listDouble = {1.1,2.2,3.3};

		//printArray(listDouble);

		//System.out.println("=======================");

		int[] newList = reverse(list);
		printArray(newList);

	}
}