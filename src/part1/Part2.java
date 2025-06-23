package part1;

import java.util.Scanner;

public class Part2 {
	public static void master() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x);
		
		scanner.nextLine();
		
		System.out.println("Ingrese su nombre");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su edad");
		int edad = scanner.nextInt();
		System.out.println("Ingrese su estatura");
		float estatura = scanner.nextFloat();
		System.out.println("Ingrese si es mujer o no");
		boolean mujer = scanner.nextBoolean();
		
		scanner.close();
		System.out.println("Datos: "+"\nNombre: "+nombre+"\nEdad: "+edad+"\nEstatura: "+estatura+"\nMujer: "+mujer);
	};
}
