public class Main {
	static int pow(int base, int exp){

		int result = 1;
		for(int i=1; i<=exp; i++){
			result *= base;
		}

		return result;
	}

	static int sum(int a, int b){
		return a+b;
	}

	static void sumTwo(int a, int b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		int result= sum(5,2) + sum(3,1);
		System.out.println(result);

		sumTwo(2,5);
	}
}