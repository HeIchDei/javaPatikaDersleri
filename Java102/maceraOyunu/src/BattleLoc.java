import java.util.Random;

public abstract class BattleLoc extends Location {

	private Monster monster;
	private String award;
	private int maxMonster;
	private Random rand = new Random();
	private int fightNum;

	public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
		super(player, name);
		this.monster = monster;
		this.award = award;
		this.maxMonster = maxMonster;
		this.fightNum = 0;
	}

	@Override
	public boolean onLocation() {
		String monsterName = this.getMonster().getName();
		int monsterNum = randomObstacleNumber();
		System.out.println("Bulunduğun yer: " + this.getName());
		System.out.println("Dikkatli ol! Burda " + monsterNum + " adet " + monsterName + " yaşıyor!");
		System.out.print("<S>avaş veya <K>aç: ");
		String selectCase = inp.nextLine().toLowerCase();
		if (selectCase.equals("s")) {
			if (combat(monsterNum)) {
				if (this.fightNum == monsterNum) {
					System.out.println("Bölgedeki tüm düşmanları yendin!");
					if(this.getName().equals("Mağara")){
						this.getPlayer().getInventory().setFood(true);
					}
					switch (this.getName()) {
						case "Mağara" -> this.getPlayer().getInventory().setFood(true);
						case "Orman" -> this.getPlayer().getInventory().setFirewood(true);
						case "Nehir" -> this.getPlayer().getInventory().setWater(true);
					}
				}
				return true;
			} else {
				return false;
			}
		}

		return true;
	}

	public boolean combat(int numberOfMonsters) {
		this.fightNum = 0;
		boolean isEscape = false;
		for (int i = 1; i <= numberOfMonsters; i++) {
			this.getMonster().setHp(this.getMonster().getMaxHp());
			if(isEscape){
				break;
			}
			while (this.getPlayer().getHp() > 0 && this.getMonster().getHp() > 0) {
				System.out.println();
				playerStats();
				System.out.println();
				monsterStats(i);
				System.out.println("<S>aldır veya <K>aç");
				String selectCombat = inp.nextLine().toLowerCase();
				if (selectCombat.equals("s")) {
					int monsterHp = this.getMonster().getHp();
					int playerDmg = this.getPlayer().getTotalDmg();
					this.getMonster().setHp(monsterHp - playerDmg);
					System.out.println(this.getPlayer().getTotalDmg() + " hasar vurdun!");
					if (this.getMonster().getHp() <= 0) {
						System.out.println("Canavar öldü!");
						getMonsterKillMoneyAward();
						break;
					}

					if (this.monster.getId() == 4) {
						this.monster.setDmg(rand.nextInt(3, 6));
					}
					int monsterDmg = (this.getMonster().getDmg()) - this.getPlayer().getArmor().getDef();
					if (monsterDmg < 0) {
						monsterDmg = 0;
					}
					int playerHp = this.getPlayer().getHp();
					this.getPlayer().setHp(playerHp - monsterDmg);
					if (this.getPlayer().getHp() <= 0) {
						return false;
					}

				} else {
					isEscape = true;
					break;
				}

			}
			this.fightNum += 1;
		}

		return true;
	}

	public void getMonsterKillMoneyAward() {
		int winnedMoney = this.getMonster().getMoneyToDrop();
		int totalMoney = this.getPlayer().getMoney() + winnedMoney;
		System.out.println(winnedMoney + " altın kazandın!");
		this.getPlayer().setMoney(totalMoney);
	}

	public void monsterStats(int i) {
		System.out.println(i + "." + this.getMonster().getName() + " Değerleri");
		System.out.println("----------------------------------");
		System.out.println("Can: " + this.getMonster().getHp());
		System.out.println("Hasar: " + this.getMonster().getDmg());
		System.out.println("Düşecek para: " + this.getMonster().getMoneyToDrop());
	}

	public void playerStats() {
		System.out.println("Oyuncu Değerleri");
		System.out.println("----------------------------------");
		System.out.println("Can: " + this.getPlayer().getHp());
		System.out.println("Hasar: " + this.getPlayer().getTotalDmg());
		System.out.println("Silah: " + this.getPlayer().getWeapon().getName());
		System.out.println("Zırh: " + this.getPlayer().getArmor().getName());
		System.out.println("Koruma: " + this.getPlayer().getArmor().getDef());
		System.out.println("Para: " + this.getPlayer().getMoney());

	}

	public int randomObstacleNumber() {
		Random r = new Random();
		return r.nextInt(this.getMaxMonster()) + 1;
	}


	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxMonster() {
		return maxMonster;
	}

	public void setMaxMonster(int maxMonster) {
		this.maxMonster = maxMonster;
	}

	public int getFightNum() {
		return fightNum;
	}

	public void setFightNum(int fightNum) {
		this.fightNum = fightNum;
	}
}
