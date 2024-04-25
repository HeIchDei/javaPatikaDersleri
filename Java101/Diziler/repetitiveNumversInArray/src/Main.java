import java.util.Arrays;

public class Main {

	static boolean isIn(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Tekrar Sayilari");

		int[] repeatedNumbers = new int[list.length];

		int repeateCount;
		int[] repeateCountList = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			repeateCount = 0;
			for (int j = 0; j < list.length; j++) {

				if (i != j && list[i] == list[j]) {
					repeateCount += 1;
				}
				if (!isIn(repeatedNumbers, list[i])) {
					repeatedNumbers[i] = list[i];
				}

			}
			repeateCountList[i] = repeateCount + 1;


		}
		for (int i = 0; i < repeatedNumbers.length; i++) {
			if (repeatedNumbers[i] != 0) {
				System.out.println(repeatedNumbers[i] + " sayisi " + repeateCountList[i] + " kere tekrar edildi.");
			}
		}
	}
}