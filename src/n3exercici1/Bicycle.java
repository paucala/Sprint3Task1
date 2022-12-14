package n3exercici1;

public class Bicycle extends Vehicle {

	public Bicycle(int speed, int maxSpeed) {
		super(speed, maxSpeed);
	}

	@Override
	public String toString() {
		return "Aquesta bicicleta actualment va a " + super.getTotalSpeed()+ " km/h";
	}

}
