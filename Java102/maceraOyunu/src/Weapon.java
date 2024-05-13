public class Weapon {
	private String name;
	private int id;
	private int dmg;
	private int price;

	public Weapon(int id, String name, int dmg, int price) {
		this.name = name;
		this.id = id;
		this.dmg = dmg;
		this.price = price;
	}


	public static Weapon[] weapons(){
		Weapon[] weaponList = new Weapon[3];
		weaponList[0] = new Weapon(1,"Tabanca", 2, 15);
		weaponList[1] = new Weapon(2,"Kılıç", 3, 35);
		weaponList[2] = new Weapon(3,"Tüfek", 7, 45);
		return weaponList;
	}

	public static Weapon getWeaponObjByID(int id){
		for(Weapon weapon: Weapon.weapons()){
			if(weapon.getId() == id){
				return weapon;
			}
		}
		return null;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
