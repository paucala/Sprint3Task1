package n3exercici1;

public class Car extends Vehicle {

	public Car(int speed, int maxSpeed) {
		super(speed, maxSpeed);
	}

	@Override
	public String toString() {
		return "Aquest cotxe actualment va a " + super.getTotalSpeed() + " km/h";
	}

}
