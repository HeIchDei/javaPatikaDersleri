public class Main {

	static void print(){
		System.out.println("Parametrseiz metot");
	}

	static void print(int a){
		System.out.println("Parametre: " + a);
	}

	static void print(double a){
		System.out.println("Parametre double: "+a);
	}

	static int print(int a, int b){
		return a+b;
	}

	static int print(int a, int b, int c){
		return a+b+c;
	}

	public static void main(String[] args) {
		print();
		print(2);
		print(2.0);
		System.out.println(print(2,3));
		System.out.println(print(2,3,4));
	}
}