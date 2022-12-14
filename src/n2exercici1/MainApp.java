package n2exercici1;

public class MainApp {

	public static void main(String[] args) {
		String country = "Spanish";
		App app = configureApp(country);
		System.out.println(app.toString());

	}
	public static App configureApp(String country) {
		App app;
		Agenda agenda;
		
		if (country.equalsIgnoreCase("Spain")) {
			agenda = new SpanishAgenda();
		} else {
			agenda = new BritishAgenda();
		}
		app = new App(agenda);
		return app;
	}

}
