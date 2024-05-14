public class House extends SafeLoc {

	public House(Player player) {
		super(player, "Ev");
	}

	@Override
	public boolean onLocation() {
		boolean food = this.getPlayer().getInventory().isFood();
		boolean firewood = this.getPlayer().getInventory().isFirewood();
		boolean water = this.getPlayer().getInventory().isWater();

		if (food && firewood && water) {
			System.out.println("Bütün eşyaları güvenle evine getirdin, artık huzurlu bir hayat sürebilirsin.");
			System.out.println("İyi iş, maceracı. Görüşmek üzere.");
			this.getPlayer().setWin(true);
		} else {
			System.out.println("Evindesin.");
			this.getPlayer().setHp(this.getPlayer().getMaxHp());
			System.out.println("Canın yenilendi!");
		}
		return true;

	}

}
