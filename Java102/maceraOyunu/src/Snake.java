import java.util.Random;

public class Snake extends Monster {

	private Weapon weapon;
	private static Random rand = new Random();


	public Snake() {
		super(4, "Yılan", rand.nextInt(3,7), 12, 0);
	}

	private int getMoney(){
		double randNumAlt = Math.random() * 100;
		if(randNumAlt < 20){
			return 10;
		}
		if(randNumAlt < 50){
			return 5;
		}
		return 1;
	}

	private Armor getArmor() {
		int id;
		double randNumAlt = Math.random() * 100;
		if (randNumAlt < 20) {
			id = 1;
		} else if (randNumAlt < 50) {
			id = 2;
		} else {
			id = 3;
		}
		return Armor.getArmorObjByID(id);
	}

	private Weapon getWeapon() {
		int id;
		double randNumAlt = Math.random() * 100;
		if (randNumAlt < 20) {
			id = 1;
		} else if (randNumAlt < 50) {
			id = 2;
		} else {
			id = 3;
		}
		return Weapon.getWeaponObjByID(id);
	}
}
