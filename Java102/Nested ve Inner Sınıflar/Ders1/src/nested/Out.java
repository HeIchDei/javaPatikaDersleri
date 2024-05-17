package nested;

// Outer class
public class Out {

	public int a = 5;
	public static int b = 20;

	// Inner class
	public static class In{
		public static int a=10;

		public static void run(){
			int a = 1;
			System.out.println(a);
			System.out.println(In.a);
			System.out.println(Out.b);
			//System.out.println(this.a);
			//System.out.println(Out.this.a);
		}
	}

	public void run(){
		In.run();
	}

	public In getIn(){
		return new In();
	}

}
