package n1exercici1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instance;
	private static ArrayList<Command> commands;
	private static ArrayList<String> chart;
	
	//el constructor es privat aixi que no es podra inicialitzar des de fora de la classe
	private Undo() {
		commands = new ArrayList<Command>();
		chart = new ArrayList<String>();
	}
	public ArrayList<Command> getCommands() {
		return commands;
	}
	public ArrayList<String> getChart() {
		return chart;
	}
	
	//inicialitzaem la classe una sola vegada (singleton)
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	//añade un comando a la lista
	public void addCommand(Command comand) {
		commands.add(comand);
	}
	//quita el ultimo comando de la lista
	public void undoCommand() {
		commands.remove(commands.size() - 1);
	}
	//els metodes per afegir productes al carretó son privats per que han  de ser accesible només des de la mateixa classe
	private static void addToChart(String o) {
		chart.add(o);
	}
	private static void removeFromChart(String o) {
		chart.remove(chart.lastIndexOf(o));
	}
	private static void showChart() {
		System.out.println("Mostrant el carretó: ");
		if (chart.isEmpty()) {
			System.out.println("El carro està buit");
		} else {
			chart.forEach(System.out::println);
		}
	}
	//Aquest metode segueix tota la llista de comands i els executa, el carretó s'actualitza cada vegada per no haver de acumular els productes
	public void runCommands() {
		chart.clear();
		for (Command c : commands) {
			if(c.getI() == 1) {
				Undo.addToChart(c.getO());
			} else if(c.getI() == 2) {
				Undo.removeFromChart(c.getO());
			} else {
				Undo.showChart();
			}
		};
	}
}
