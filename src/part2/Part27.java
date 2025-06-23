package part2;

import part2.assets.Pizza;

public class Part27 {
	
	static void master() {
		
		//sobrecarga de constructores
		// multiples constructores dentro de una clase con el mismo nombre pero diferentes parametros
		// nombre + parametros = firma (signature)
		
		Pizza pizza1 = new Pizza("Cebada", "Tomate", "Rayado", "Ripio");
		pizza1.mostrarAtributos();
		System.out.println();
		
		Pizza pizza2 = new Pizza("Cebada", "Tomate", "Rayado");
		pizza2.mostrarAtributos();
		System.out.println();
		
		Pizza pizza3 = new Pizza("Cebada", "Tomate");
		pizza3.mostrarAtributos();
		System.out.println();
		
		Pizza pizza4 = new Pizza("Cebada");
		pizza4.mostrarAtributos();
		System.out.println();
	}

}