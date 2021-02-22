package Vehicles;

public class Car extends Vehicle {
	CarType type;
	int maxNumberOfPeople;
	int currentNumberOfPeople;
	
	public Car(String brand, String model, int maxSpeed, int enginePower,
			int maxNumberOfPeople) {
		super(brand, model, maxSpeed, enginePower);
		this.maxNumberOfPeople = maxNumberOfPeople;
		this.currentNumberOfPeople = 0;
	}
	
	public Car(String brand, String model, int maxSpeed, int enginePower,
			CarType type, int maxNumberOfPeople) {
		super(brand, model, maxSpeed, enginePower);
		this.type = type;
		this.maxNumberOfPeople = maxNumberOfPeople;
		this.currentNumberOfPeople = 0;
	}

	
	public void drive(int speed, int numberOfPeople) {
		super.move(speed);
		if (numberOfPeople > this.maxNumberOfPeople) {
			this.currentNumberOfPeople = this.maxNumberOfPeople;
		} else if (numberOfPeople <= 0) {
			this.currentNumberOfPeople = 1;
		} else {
			this.currentNumberOfPeople = numberOfPeople;
		}
	}
	

}
