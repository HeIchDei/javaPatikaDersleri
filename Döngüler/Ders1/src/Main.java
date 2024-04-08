public class Main {
	public static void main(String[] args) {
		int i = 1, k;

		System.out.println("Started");

		while(i <= 5){
			System.out.println(i++);
			k = 1;
			while(k <= 10){
				System.out.print(k++ + ", ");
			}
			System.out.println(2);
		}

		System.out.println("Stopped");

		int left = 100, right = 200;

		while(++left < --right);
		System.out.println(left);

	}
}