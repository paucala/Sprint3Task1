package n3exercici1;

public class Boat extends Vehicle{

	public Boat(int speed, int maxSpeed) {
		super(speed, maxSpeed);
	}
	@Override
	public String toString() {
		return "Aquest vaixell actualment va a " + super.getTotalSpeed()+ " km/h";
	}

}
