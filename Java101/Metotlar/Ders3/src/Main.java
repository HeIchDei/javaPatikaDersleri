public class Main {

	static int f(int x){
		int result=0;
		for(int i=1; i<=x; i++){
			result += i;
		}
		return result;
	}

	static int r(int n){
		System.out.println(n);
		if(n==1){
			return 1;
		}
		return r(n-1) +n;
	}

	public static void main(String[] args) {
		r(10);
	}
}