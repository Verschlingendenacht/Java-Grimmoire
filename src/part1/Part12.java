package part1;

import java.util.Scanner;

public class Part12 {
	public static void master() {
		
		Scanner scanner = new Scanner(System.in);
		
		int filas;
		int columnas;
		String simbolo = "";
		
		System.out.println("Ingresa el numero de filas: ");
		filas = scanner.nextInt();
		
		System.out.println("Ingresa el numero de columnas: ");
		columnas = scanner.nextInt();
		
		System.out.println("Ingresa el simbolo a usar");
		simbolo = scanner.next();
		
		for(int i = 1; i <= filas; i++) {
			System.out.println(); //Mueve el algoritmo a la siguiente fila
			for(int j = 1; j <= columnas; j++) {
				System.out.print(simbolo); //Imprime el simbolo pero cada vez que lo hace, lo hace sin el salto de linea (por ello usamos print y no println), una vez imprima el numero de columnas por fila requeridas, sale del bucle y vuelve a la siguiente iteracion del bucle de afuera el cual se mueve a la siguiente fila
			}
		}
		
		scanner.close();
		
		
	}
}
