package part1;

import java.util.*;

public class Part18 {
	public static void master() {
		
		ArrayList<String> pasteleriaLista = new ArrayList();
		pasteleriaLista.add("Pasta");
		pasteleriaLista.add("Galletas");
		pasteleriaLista.add("Rollos");
		System.out.println(pasteleriaLista); //A diferencia de con un arreglo primitivo, las listas permiten mostrar todo su contendio sin necesidad de un iterador
		
		ArrayList<String> fruteriaLista = new ArrayList();
		fruteriaLista.add("Mangos");
		fruteriaLista.add("Bananos");
		fruteriaLista.add("Manzanas");
		System.out.println(fruteriaLista);
		
		ArrayList<String> farmaciaLista = new ArrayList();
		farmaciaLista.add("Ibuprofeno");
		farmaciaLista.add("Acetaminofen");
		farmaciaLista.add("Clotrimazol");
		System.out.println(farmaciaLista);
		
		//Creacion de arraylista bidimensional
		ArrayList<ArrayList<String>> mercadoLista = new ArrayList();
		
		System.out.println("---------------");
		mercadoLista.add(pasteleriaLista);
		mercadoLista.add(fruteriaLista);
		mercadoLista.add(farmaciaLista);
		
		System.out.println(mercadoLista); //Matriz
		System.out.println(mercadoLista.get(0)); //Fila
		System.out.println(mercadoLista.get(0).get(0)); //Fila y Columna (elemento)
		
	}
}
