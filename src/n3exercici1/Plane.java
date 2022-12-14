package n3exercici1;

public class Plane extends Vehicle {

	public Plane(int speed, int maxSpeed) {
		super(speed, maxSpeed);
	}

	@Override
	public String toString() {
		return "Aquest avió actualment va a " + super.getTotalSpeed()+ " km/h";
	}

}
