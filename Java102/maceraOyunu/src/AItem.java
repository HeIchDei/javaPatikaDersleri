public class AItem {

	private int id;
	private String name;
	private boolean doPlayerHave;

	public AItem(int id, String name, boolean doPlayerHave) {
		this.id = id;
		this.name = name;
		this.doPlayerHave = doPlayerHave;
	}


	public static AItem[] items(){
		AItem[] AItemList = new AItem[3];
		AItemList[0] = new AItem(1, "Yemek", false);
		AItemList[1] = new AItem(2, "Odun", false);
		AItemList[2] = new AItem(3, "Su", false);
		return AItemList;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDoPlayerHave() {
		return doPlayerHave;
	}

	public void setDoPlayerHave(boolean doPlayerHave) {
		this.doPlayerHave = doPlayerHave;
	}
}
