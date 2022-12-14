package n3exercici1;

public class RunCommand extends Command {

	public RunCommand(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public boolean execute() {
		if (super.getVehicle().getStart() == true) {
			System.out.println("El vehicle ja estava arrencat");
		}
		return true;
	}

}
