public class Main {
	public static void main(String[] args) {
		int day = 3;

		switch(day){
			case 1:
				System.out.println("Bugun pazartesi");
				break;
			case 2:
				System.out.println("Bugun sali");
				break;
			case 3:
				System.out.println("Bugun carsamba");
				break;
			default:
				System.out.println("Invalid format");
		}
	}
}