package n3exercici1;

public class BrakeCommand extends Command {

	public BrakeCommand(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public boolean execute() {
		if (super.getVehicle().getTotalSpeed() == 0 ) {
			return false;
		}else {
			return true;
		}
	}

}
