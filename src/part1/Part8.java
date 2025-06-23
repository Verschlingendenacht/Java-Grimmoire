package part1;

import java.util.Scanner;

public class Part8 {
	
	public static void master() {
		
		//El switch permite probar una variable en terminos de igualdad contra una lista de valores
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el dia de la semana");
		String dia =  scanner.nextLine();
		
		switch(dia) {
			case "Lunes":
				System.out.println("Examen de programacion");
				break;
			case "Martes":
				System.out.println("Examen de Matematicas e Ingles");
				break;
			case "Miercoles":
				System.out.println("Parche libre");
				break;
			case "Jueves":
				System.out.println("No hay clase");
				break;
			case "Viernes":
				System.out.println("Clase parchada");
				break;
			default:
				System.out.println("Es fin de semana y el cuerpo lo sabe");
				
			
		}
		
		//Break funciona como el delimitante de donde termina el caso, si no se incluye "break" al final de un caso el resto de casos seran ejecutados
		//Default no requiere de un break a su final dado que es lo ultimo que se incluye
		scanner.close();
		
	}
}
