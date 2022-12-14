package n3exercici1;

public abstract class Command {
	
	private Vehicle vehicle;
	
	public Command(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public abstract boolean execute();

}
