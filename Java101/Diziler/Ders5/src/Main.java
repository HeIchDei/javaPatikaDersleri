import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] list = {1, 2, 3, 4, 5, 6, 7};
		Arrays.fill(list, 2, 4, 10);
		//System.out.println(HelperArray.search(list, 2));

		int[] list2 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
		Arrays.sort(list2);
		//System.out.println(Arrays.binarySearch(list, 1));

		//System.out.println(Arrays.toString(list2)); // overrideable

		int[] copyList = Arrays.copyOf(list, 4);
		int[] copyList2 = Arrays.copyOfRange(list, 2, 4);
		//System.out.println(Arrays.toString(copyList2));

		int[] testArr = {51, 61, 71, 8, 75};
		int[] testArr2 = HelperArray.copyOfRange(testArr, 1, 3);
		//System.out.println(Arrays.toString(testArr2));

		int[] liste = {1, 2, 3};
		int[] liste2 = {1, 2, 3};
		int[] liste3 = {3, 5, 3};
		System.out.println(HelperArray.equals(liste, liste2));

	}
}