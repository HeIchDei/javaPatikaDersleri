public class Main {

	public static void main(String[] args){


		Book hp = new Book("Harry Potter", 150);
		Book lotr = new Book("Lotf of the Rings", -100);
		lotr.setPageNumber(999);
		System.out.println(lotr.getPageNumber());


	}

}
