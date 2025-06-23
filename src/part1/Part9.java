package part1;

import java.util.Scanner;

public class Part9 {
	public static void master() {
		
		//Los operadores logicos son usados para conectar una o mas expresiones
		
		//&& = (AND)
		//|| = (OR)
		//! = (NOT) -> reversa el valor booleano de la expresion (si es falso pasa a ser verdadero y viceversa)
		
		//Usando &&
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("Hace demasiado calor");
		} else if (temp>=20 && temp<=30) {
			System.out.println("El clima esta templado");
		} else if (temp>=0 && temp<30) {
			System.out.println("Esta haciendo frio");
		} else {
			System.out.println("Esta cayendo nieve");
		}
		
		//Usando || y !
		
		String opcion;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa Q o q si quieres salir del programa, tambien puedes escribir 'salir'");
		opcion = scanner.nextLine();
		
		if(!opcion.equals("Q") && !opcion.equals("q") && !(opcion.equals("salir") || opcion.equals("Salir"))) {
			System.out.println("Todavia permaneces en el programa");
		} else {
			System.out.println("Terminando programa con exito!");
		}
		
		scanner.close();
		
		
	}
}
