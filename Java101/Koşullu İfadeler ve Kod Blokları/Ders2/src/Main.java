public class Main {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 1;


		if((a < b) && (a < c)){
			System.out.println("Min : a");
		}else if((b < a) && (b < c)){
			System.out.println("Min : b");
		}else if((c < a) && (c < b)){
			System.out.println("Min : c");
		}


	}
}