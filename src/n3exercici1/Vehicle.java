package n3exercici1;

public abstract class Vehicle {
	private final int speed;
	private final int maxSpeed;
	private int totalSpeed;
	private boolean start;
	
	public Vehicle(int speed, int maxSpeed) {
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.totalSpeed = 0;
		this.start = false;
	}

	public int getSpeed() {
		return this.speed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public int getTotalSpeed() {
		return this.totalSpeed;
	}
	public boolean getStart() {
		return this.start;
	}

	//encen el vehicle si no està ences (podriem fer un altre metode per apagar-lo però l'exercici no ho demana)
	public void start() {
		RunCommand rc = new RunCommand(this);
		rc.execute();
		this.start = true;
	}
	//accelera el vehicle si no ha arribat a la velocitat màxima
	public void accelerate() {
		if (this.start) {
			AccelerateCommand ac = new AccelerateCommand(this);
			boolean isPossible = ac.execute();
			if (isPossible) {
				//no permet pujar la velocitat per sobre de la màxima
				if ((this.totalSpeed + this.speed) > this.maxSpeed) {
					this.totalSpeed = this.maxSpeed;
				} else {
					this.totalSpeed += this.speed;
				}
			} else {
				System.out.println("El vehicle no pot accelerar més");
			}	
		} else {
			System.out.println("Has d'encendre el vehicle");
		}
		
	}
	//frena el vehicle si no està parat
	public void brake() {
		if (this.start) {
			BrakeCommand bc = new BrakeCommand(this);
			boolean isPossible = bc.execute();
			if (isPossible) {
				//no permet baixar la velocitat per sota de 0
				if ((this.totalSpeed - this.speed) < 0) {
					this.totalSpeed = 0;
				} else {
					this.totalSpeed -= this.speed;
				}
			} else {
				System.out.println("El vehicle està parat");
			}
		}else {
			System.out.println("Has d'encendre el vehicle");
		}
		
	}
	public abstract String toString();


}
