public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void run(){
		if(isCheck()){
			while(this.f1.hp > 0 && this.f2.hp > 0){
				System.out.println("=========NEW ROUND============");
				this.f2.hp = this.f1.hit(this.f2);
				if(isWin()){
					break;
				}
				this.f1.hp = this.f2.hit(this.f1);
				if(isWin()){
					break;
				}
				System.out.println(this.f1.name + " hp: " + this.f1.hp);
				System.out.println(this.f2.name + " hp: " + this.f2.hp);
			}
		}else{
			System.out.println("Siklet uyusmazligi!!");
		}
	}

	boolean isCheck(){
		return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}

	boolean isWin(){
		if(this.f1.hp == 0){
			System.out.println(this.f2.name + " won!");
			return true;
		}

		if(this.f2.hp == 0){
			System.out.println(this.f1.name + " won!");
			return true;
		}

		return false;
	}

}
