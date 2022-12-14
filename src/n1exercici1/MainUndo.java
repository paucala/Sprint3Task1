package n1exercici1;

import java.util.Scanner;

public class MainUndo {

	public static void main(String[] args) {
		Undo u = Undo.getInstance();
		initMenu(u);
	
		
		
	}
	public static void initMenu(Undo u) {
		Scanner entry = new Scanner(System.in);
		int op = 0;
		do {
			String s = "";
			Command c;
			System.out.println("Benvingut a la botiga online, escull una opció\n"
				+ "1. Afegir producte al carretó\n"
				+ "2. Treure producte del carretó\n"
				+ "3. Mostrar el carretó\n"
				+ "4. Desfer una acció\n"
				+ "0. Sortir");
			op = entry.nextInt();
			entry.nextLine();
			switch (op) {
			case 1:
				System.out.println("Escull el producte: ");
				s = entry.nextLine();
				c = new Command(op, s);
				u.addCommand(c);
				break;
			case 2:
				System.out.println("Escull el producte: ");
				s = entry.nextLine();
				c = new Command(op, s);
				u.addCommand(c);
				break;
			case 3:
				c = new Command(op, s);
				u.addCommand(c);
				break;
			case 4:
				u.undoCommand();
				break;
			case 0:
				System.out.println("adeú");
				break;
			default:
				System.out.println("Aquesta opció no existeix");
			}
			u.runCommands();
			
		} while (op != 0);
		}

}
