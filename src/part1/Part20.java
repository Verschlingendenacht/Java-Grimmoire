package part1;

public class Part20 {
	
	static void master() { //por defecto los metodos son publicos
		
		// metodo = bloque de codigo que es ejecutado una vez llamado
		hola();
		metodo2("Alejandro"); //arguments
		System.out.println(metodo3(2,2));
		
	}
	
	static void hola() {
		
		System.out.println("Hola");
		
	}
	
	static void metodo2(String nombre) { //parameters
		System.out.println("Hola "+nombre);
	}
	
	static int metodo3(int a, int b) {
		return a+b;
	}
}
