class Car{

	// Nitelikler
	String type;
	String model;
	String color;
	int speed;
	int speedLimit = 180;

	Car(String model, int speed, String color){ //constructive method
		this.model = model;
		this.speed = speed;
		this.color = color;
		this.type = "Sedan";
		this.speedLimit = 180;
		System.out.println("Parametreli constructive");
	}

	Car(){
		System.out.println("Bos constructive method");
	}

	void increaseSpeed(int increment){
		if((this.speed + increment) < this.speedLimit){
			this.speed += increment;
		}
	}

	void decreaseSpeed(int decrease){
		if(this.speed > 0){
			this.speed -= decrease;
		}
	}

	void printSpeed(){
		System.out.println(this.model + " geldi " +
				"Hiziniz: " + this.speed);
	}

	void printInfo(){
		System.out.println("Model\t: " + this.model);
		System.out.println("Color:\t: " + this.color);
		System.out.println("Type\t: " + this.type);
		System.out.println("Speed\t: " + this.speed);
	}

}