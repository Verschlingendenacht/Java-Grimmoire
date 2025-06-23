package part1;

import java.util.Scanner;

public class Part10 {

	public static void master() {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while(!name.equals("Scarlett")) {
			System.out.println("Ingresa tu nombre");
			name = scanner.nextLine();
			
		}
		
		System.out.println("Bienvenida Scarlett");
		
		do {
			System.out.println("Ingresa tu nombre: ");
			name = scanner.nextLine();
		} while(name.isBlank());
		
		System.out.println("Bienvenid@: "+name);
		
		scanner.close();
	}
}
