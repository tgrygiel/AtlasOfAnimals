package Vehicles;

public abstract class Vehicle {
	String brand;
	String model;
	int maxSpeed;
	int enginePower;
	boolean isEngineRunning;
	int currspeed;
	
	public Vehicle(String brand, String model, int maxSpeed, int enginePower) {
		super();
		this.brand = brand;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.enginePower = enginePower;
		this.isEngineRunning = false;
		this.currspeed = 0;
	}

	public boolean runEngine() {
		if (this.isEngineRunning) {
			return false;
		} 
		this.isEngineRunning = true;
		return true;
	}
	
	public boolean stopEnging() {
		if (this.isEngineRunning) {
			this.isEngineRunning = false;
			return true;
		}
		return false;
	}
	
	public void move(int speed) {
		if (speed < this.maxSpeed && speed > 0) {
			this.currspeed = speed;			
		} else {
			this.currspeed = maxSpeed;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public boolean isEngineRunning() {
		return isEngineRunning;
	}

	public void setEngineRunning(boolean isEngineRunning) {
		this.isEngineRunning = isEngineRunning;
	}

	public int getCurrspeed() {
		return currspeed;
	}

	public void setCurrspeed(int currspeed) {
		this.currspeed = currspeed;
	}
}
