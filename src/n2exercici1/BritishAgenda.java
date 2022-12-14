package n2exercici1;

public class BritishAgenda implements Agenda {

	@Override
	public Telephone createTelephone() {
		return new BritishTelephone();
	}

	@Override
	public Address createAddress() {
		return new BritishAddress();
	}

}
