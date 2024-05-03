public class HelperArray {

	static void print(int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

	static int[] fill(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
		}
		return arr;
	}

	static int search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	static int[] copyOfRange(int[] arr, int from, int to) {
		int[] returnArr = new int[to - from + 1];
		for (int originalIndex = from, newIndex = 0; newIndex <= to - from; originalIndex++, newIndex++) {
			returnArr[newIndex] = arr[originalIndex];
		}
		return returnArr;
	}

	static boolean equals(int[] l1, int[] l2) {
		if (l1.length != l2.length) {
			return false;
		}

		for (int i = 0; i < l1.length; i++) {
			if (l1[i] != l2[i]) {
				return false;
			}
		}

		return true;

	}

}
