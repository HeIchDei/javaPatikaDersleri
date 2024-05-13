public abstract class DangerousLoc extends Location{

	private boolean isDead = false;

	public DangerousLoc(Player player, String name) {
		super(player, name);
	}

	@Override
	public boolean onLocation(){
		//fight
		if(isDead){
			System.out.println("GAME OVER");
			return false;
		}
		else{
			return true;
		}
	}


}
