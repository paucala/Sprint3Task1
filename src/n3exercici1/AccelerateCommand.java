package n3exercici1;

public class AccelerateCommand extends Command {

	public AccelerateCommand(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public boolean execute() {
		if (super.getVehicle().getTotalSpeed() < super.getVehicle().getMaxSpeed() ) {
			return true;
		}else {
			return false;
		}
	}

}
