public class User {

	public String name;
	public static int counter;

	static {
		int random = (int) (Math.random() *10);
		System.out.println("random sayi: " + random);
		counter = random;
	}


	public User(String name){
		this.name = name;
		counter++;
	}

}
