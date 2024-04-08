public class Main {
	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++){
			if(i == 5){
				System.out.println("I bestir bestir beeesstiiiiirr");
				break;
			}
			System.out.println(i);
		}

		for(int i = 1; i <= 10; i++){
			if(i == 5){
				continue;
			}
			System.out.println(i);
		}

	}
}