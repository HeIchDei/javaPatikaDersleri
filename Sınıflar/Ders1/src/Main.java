public class Main{
	public static void main(String[] args){

		Car audi = new Car();
		audi.model = "Audi";
		audi.speed = 10;
		audi.increaseSpeed(20);
		audi.decreaseSpeed(10);
		audi.printSpeed();

		Car bmw = new Car();
		bmw.model = "BMW";
		bmw.speed = 20;
		bmw.printSpeed();


		Car mercedes = new Car();
		mercedes.model = "Mercedes";
		mercedes.speed = 30;
		mercedes.printSpeed();

	}
}