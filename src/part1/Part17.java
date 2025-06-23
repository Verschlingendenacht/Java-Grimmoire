package part1;

import java.util.ArrayList;

public class Part17 {
	public static void master() {
		
		// ArrayList = arreglo de tamaño dinamico
		// sus elementos pueden ser añadidos o eliminados incluso luego de ser compilados
		// solo pueden almacenar datos de tipo referencia
		
		ArrayList<String> comida = new ArrayList<String>();
		
		//No se puede agregar varios al mismo tiempo en una sola linea, se deben hacer llamadas separadas
		//Añadir elemento al final
		System.out.println("AÑADIR ELEMENTO");
		comida.add("Pizza");
		comida.add("Hamborgesa");
		comida.add("Perro");
		
		for(int i = 0;i<comida.size();i++) {
			//System.out.println(comida[i]); //esto solo funciona con arreglos primitivos
			System.out.println(comida.get(i)); //Para referenciar el indice de un arraylist se debe usar el metodo get
		}
		
		//Actualizar elemento
		System.out.println("ACTUALIZAR ELEMENTO");
		comida.set(0, "Salchipapa");
		
		for(int i = 0;i<comida.size();i++) {
			System.out.println(comida.get(i));
		}
		
		//Eliminar elemento
		System.out.println("ELIMINAR ELEMENTO");
		comida.remove(0);
		
		for(int i = 0;i<comida.size();i++) {
			System.out.println(comida.get(i));
		}
		
		//Limpiar el ArrayList
		System.out.println("LIMPIAR ARRAYLIST");
		comida.clear();
		
		for(int i = 0;i<comida.size();i++) {
			System.out.println(comida.get(i));
		}
		
		
	}
}
