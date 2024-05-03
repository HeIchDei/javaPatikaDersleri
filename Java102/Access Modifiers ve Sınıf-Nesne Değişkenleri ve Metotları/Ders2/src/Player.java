public class Player {
	public String name;
	public int id = 5;

	public static int count = 0;

	public Player(String name, int id){
		this.name = name;
		this.id = id;
	}

	public static void showName(){
		Player p1 = new Player("a",1);
		System.out.println(p1.name);
	}

}
