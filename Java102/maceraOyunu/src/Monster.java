public class Monster {

	private int id;
	private String name;
	private int dmg;
	private int hp;
	private int maxHp;
	private int moneyToDrop;

	public Monster(int id, String name, int dmg, int hp, int moneyToDrop) {
		this.id = id;
		this.name = name;
		this.dmg = dmg;
		this.hp = hp;
		this.maxHp = hp;
		this.moneyToDrop = moneyToDrop;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0){
			hp = 0;
		}
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoneyToDrop() {
		return moneyToDrop;
	}

	public void setMoneyToDrop(int moneyToDrop) {
		this.moneyToDrop = moneyToDrop;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
}
