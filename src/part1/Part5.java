package part1;

import java.util.Scanner;

public class Part5 {
	public static void master() {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); //retorna el mas grande de los dos
		System.out.println(z);
		
		z = Math.min(x, y);
		System.out.println(z); //retorna el menor de los dos
		
		System.out.println(Math.abs(z)); //valor absoluto de un numero
		
		int w = 16;
		System.out.println(Math.sqrt(w)); //raiz cuadrada de un numero
		System.out.println(Math.round(x)); //redondear un numero al entero mas cercano
		System.out.println(Math.ceil(x)); //redondea un numero al entero siguiente mas cercano
		System.out.println(Math.floor(x)); //redondea un numero al entero anterior mas cercano
		
		
		//ENCONTRAR LA HIPOTENUSA DE UN TRIANGULO
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el lado A");
		a = scanner.nextDouble();
		
		System.out.println("Ingresa el lado B");
		b = scanner.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("La hipotenusa es: "+c);
		scanner.close();
		
		
	}
}
