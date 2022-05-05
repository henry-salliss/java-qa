package moreInheritance;

public class Car {
	String model;
	int speed;
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void getToSixty() {
		speed = 60;
	}
	
	public void accelerate(int seconds) {
		int extraSpeed = 5 * seconds;
		speed += extraSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void showDetails() {
		System.out.println("speed: " + speed);
		System.out.println("model: " + model);
	}
	
	
}
