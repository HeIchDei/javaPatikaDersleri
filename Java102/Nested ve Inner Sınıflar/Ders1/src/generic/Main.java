package generic;

public class Main {
	public static void main(String[] args) {

		//Nullable<Integer> n = new Nullable<>(10);
		//n.run();

		/*Integer a = 10;
		String b = "Patika";
		Double d = 3.14;
		String c = "dev";
		Test<Integer, String, Double> t = new Test<>(a,b,d);
		t.setObj2(c);

		t.showInfo();*/


		/*String[] a = {"Java", "102", "Patika", "dev"};
		Integer[] b = {1, 2, 3, 4};
		Character[] c = {'J','A','V','A'};

		Print.printArray(a);
		Print.printArray(b);
		Print.printArray(c, b);*/



		//Student<Integer> stu = new Student<>();
		//stu.insert(55);


		Integer a = null;
		String str = "123";
		A aObj = null;
		Nullable<A> n1 = new Nullable<>(aObj);
		n1.run();



	}
}
