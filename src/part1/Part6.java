package part1;

import java.util.Random;

public class Part6 {
	
	public static void master() {
		
		Random random = new Random();
		
		//Generar numeros entre -2 billones hasta 2 billones
		//Considerar: el numero almacenado sera limitado por la capacidad de memoria de la variable en la que se almacena
		int x = random.nextInt();
		boolean y = random.nextBoolean();
		float z = random.nextFloat();
		double w = random.nextDouble();
		
		System.out.println(x);
		
		//Generar numeros de forma controlada (poniendo limites)
		//el parametro del metodo es excluyente
		int a = random.nextInt(6); //numero de 0 a 5
		System.out.println(a);
		
		int b = random.nextInt(6)+1; //numero de 1 a 6
		System.out.println(b);
		
		
		
	};
}
