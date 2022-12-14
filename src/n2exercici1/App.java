package n2exercici1;

public class App {
	private Telephone t;
	private Address a;
	
	public App(Agenda agenda) {
		this.t = agenda.createTelephone();
		this.a = agenda.createAddress();
	}
	public String toString() {
		return this.t.message() + "\n" + this.a.message();
	}

}
