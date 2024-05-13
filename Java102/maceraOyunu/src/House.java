public class House extends SafeLoc{

	public House(Player player){
		super(player, "Ev");
	}

	@Override
	public boolean onLocation(){
		System.out.println("Evindesin.");
		this.getPlayer().setHp(this.getPlayer().getMaxHp());
		System.out.println("Canın yenilendi!");
		return true;
	}

}
