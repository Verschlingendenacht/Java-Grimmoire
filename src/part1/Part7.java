package part1;

import java.util.Scanner;

public class Part7 {
	public static void master() {
		
		Scanner scanner = new Scanner(System.in);
		int edad;
		
		System.out.println("Ingresa tu edad: \n");
		edad = scanner.nextInt();
		
		if(edad>=18) {
			System.out.println("Eres un adulto");
		} else if(edad>=12) {
			System.out.println("Eres un adolescente");
		} else {
			System.out.println("Eres un niño");
		}
		
		scanner.close();
		
		
	}
}
