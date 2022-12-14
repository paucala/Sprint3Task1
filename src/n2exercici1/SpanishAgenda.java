package n2exercici1;

public class SpanishAgenda implements Agenda {

	@Override
	public Telephone createTelephone() {
		return new SpanishTelephone();
	}

	@Override
	public Address createAddress() {
		return new SpanishAddress();
	}

}
