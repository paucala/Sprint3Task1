package n3exercici1;

public class Parking {

	public static void main(String[] args) {
		Car c = new Car(20, 200);
		Bicycle b = new Bicycle(3, 60);
		Boat bo = new Boat(10, 100);
		Plane p = new Plane(30, 350);
		
		//comprovem que els metodes funcionen
		c.start();
		c.accelerate();
		c.accelerate();
		c.brake();
		System.out.println(c.toString());
		
		//comprovem que no deixa accelerar més del maxim i que no pot frenar per sota de 0
		p.start();
		for (int i = 0; i < 15; i++) {
			p.accelerate();
		}
		System.out.println(p.toString());
		p.brake();
		System.out.println(p.toString());
		for (int i = 0; i < 11; i++) {
			p.brake();
		}
		System.out.println(p.toString());
		
		//comprovem que s'ha darrencar el vehicle 
		bo.accelerate();
		bo.start();
		bo.brake();
		
		//comprovem que el vehicle comença a 0 i que ha d'estar accelerat per frenar
		System.out.println(b.toString());
		b.start();
		b.brake();

	}

}
