package part2;

import part2.assets.Human;

public class Part25 {

	static void master() {
		
		//Constructor: metodo especial que es llamado cuando estamos instanciando (creando un objeto)
		
		Human humano1 = new Human("Luz", 19, 50.0);
		Human humano2 = new Human("Alejandro", 22, 56.0);
		
		System.out.println(humano1.nombre);
		System.out.println(humano2.nombre);
		
		humano1.comer();
		humano2.comer();
		humano1.beber();
		humano2.beber();
		
	}
}
