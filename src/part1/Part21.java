package part1;

public class Part21 {
	static void master() {
		
		//Un metodo es unico por su nombre Y parametros, un metodo sobrecargado se refiere a un metodo cuyo nombre ya es compartido por otro metodo pero ambos difieren en sus parametros
		
		//Resumidamente, solo se tiene en cuenta:
		//tipo de dato
		//cantidad de parametros
		
		//No se tiene en cuenta:
		//nombre del parametro
		//orden del parametro
		
		System.out.println(sumar(2,2));

	}
	
	static int sumar(int a) {
		return a;
	}
	
	static int sumar(int a, int b) {
		return a+b;
	}
	
	static int sumar(int a, int b, int c) {
		return a+b+c;
	}
	
	static double sumar(double a, double b) {
		return a+b;
	}
	
	static double sumar(int a, double b) {
		return a+b;
	}
	
	static double sumar(double a, int b) {
		return a+b;
	}
}
