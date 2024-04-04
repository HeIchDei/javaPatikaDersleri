public class Main {
	public static void main(String[] args) {
		int a = 10, b = 20;

		boolean compare = a == b;

		String str = compare ? "Esittir" : "Esit Degildir";

		System.out.println(str);

		if(compare){
			System.out.println("Esittir");
		}else {
			System.out.println("Esit Degildir");
		}

		System.out.println("Program bitti!");

	}
}