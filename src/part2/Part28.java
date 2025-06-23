package part2;

import part2.assets.ObjetoA;

public class Part28 {
	
	static void master() {
		
		//toString() = metodo especial que todos los objetos heredan
		// retorna un string que "representa textualmente" a un objeto
		// podemos usarlo implicita o explicitamente, pero se debe de definir en la clase del objeto
		
		ObjetoA objeto1 = new ObjetoA("Alejandro", 140, true, 14.5934444f);
		System.out.println(objeto1.toString()); //explicitamente
		System.out.println();
		System.out.println(objeto1); //implicitamente
		
	}
}
