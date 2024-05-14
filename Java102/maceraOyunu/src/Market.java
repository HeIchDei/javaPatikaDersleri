public class Market extends SafeLoc {

	public Market(Player player) {
		super(player, "Market");
	}

	@Override
	public boolean onLocation() {
		boolean main = true;
		while (main) {
			System.out.println("\nMarkete hoşgeldin!");
			System.out.println("1 - Silahlar");
			System.out.println("2 - Zırhlar");
			System.out.println("0 - Çıkış");
			System.out.print("Seçimin: ");
			int selectCase = Location.inp.nextInt();

			switch (selectCase) {
				case 1:
					printWeapon();
					buyWeapon();
					break;
				case 2:
					printArmor();
					buyArmor();
					break;
				default:
					main = false;
					break;

			}

		}
		return true;
	}


	public void printWeapon() {
		System.out.println("\nSilahlar");
		for (Weapon weapon : Weapon.weapons()) {
			System.out.println(
					weapon.getId() + " - " +
							weapon.getName() +
							"\t\tHasar: " + weapon.getDmg() +
							"\tÜcret: " + weapon.getPrice()
			);
		}
		System.out.println("0 - Çıkış");
	}

	public void buyWeapon() {
		System.out.print("Almak istediğin silahı seç: ");
		int selectWeaponID = inp.nextInt();

		if (selectWeaponID != 0) {
			Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
			if (selectedWeapon != null) {
				if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye!");
				} else {
					// Satin almanin gerceklestigi alan
					System.out.println(selectedWeapon.getName() + " satın alındı!");
					this.getPlayer().takeMoney(selectedWeapon.getPrice());
					System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
					Weapon previousWeapon = this.getPlayer().getInventory().getWeapon();
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					Weapon currentWeapon = this.getPlayer().getInventory().getWeapon();
					System.out.println("\nYeni bir silah aldın!");
					System.out.println(previousWeapon.getName() + " --> " + currentWeapon.getName());
				}
			}
		}
	}

	public void printArmor() {
		System.out.println("\nZırhlar");
		for (Armor armor : Armor.armors()) {
			System.out.println(
					armor.getId() + " - " +
							armor.getName() +
							"\t\tKoruma: " + armor.getDef() +
							"\tÜcret: " + armor.getPrice()
			);
		}
		System.out.println("0 - Çıkış");
	}

	public void buyArmor() {
		System.out.print("Almak istediğin zırhı seç: ");
		int selectArmorID = inp.nextInt();
		if (selectArmorID != 0) {
			Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
			if (selectedArmor != null) {
				if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye!");
				} else {
					// Satin almanin gerceklestigi alan
					System.out.println(selectedArmor.getName() + " satın alındı!");
					this.getPlayer().takeMoney(selectedArmor.getPrice());
					System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
					Armor previousArmor = this.getPlayer().getInventory().getArmor();
					this.getPlayer().getInventory().setArmor(selectedArmor);
					Armor currentArmor = this.getPlayer().getInventory().getArmor();
					System.out.println("\nYeni bir zırh aldın!");
					System.out.println(previousArmor.getName() + " --> " + currentArmor.getName());
				}
			}
		}
	}


}
