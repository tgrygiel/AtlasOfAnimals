package Vehicles;

public class Plane extends Vehicle {
	int maxHeight;
	int currentHeight;
	public Plane(String brand, String model, int maxSpeed, int enginePower,
			int maxHeight) {
		super(brand, model, maxSpeed, enginePower);
		this.maxHeight = maxHeight;
		this.currentHeight = 0;
	}
	
	public void fly(int speed, int height) {
		this.move(speed);
		if (height > this.maxHeight) {
			this.currentHeight = this.maxHeight;
		} else if (height < 0) {
			this.currentHeight = 0;
		} else {
			this.currentHeight = height;			
		}
	}
}
