package part1;

public class Part15 {
	
	public static void master() {
		
		//Las cadenas (String) son del tipo referencia, los datos de tipo referencia pueden almacenar uno o mas caracteres
		
		//Estos son solo algunos de los mas populares metodos para lidiar con cadenas
		
		String name = "Bro";
		
		System.out.println(name.equals("Bro")); //retorna un valor booleano si el aplicado equivale exactamente al parametro, case-sensitive
		
		System.out.println(name.equalsIgnoreCase("bro")); //Lo mismo que el anterior pero aqui ya no es case-sensitive
		
		System.out.println(name.length()); //longitud natural del aplicado
		
		System.out.println(name.charAt(0)); //retorna el caracter en la posicion dada del aplicado, este metodo procesa al aplicado cadena como si fuese una arreglo
		
		System.out.println(name.indexOf("B")); //retorna el indice donde se encuentre el parametro dentro del aplicado, similar al anterior, el metodo procesa al aplicado como si fuese un arreglo y retorna su posicion
		//NOTA: retorna -1 si no encuentra el caracter
		//NOTA 2: es case-sensitive
		
		System.out.println(name.isEmpty()); //retorna un valor booleano si la cadena esta vacia o no (verdadero para vacio, falso para lleno)
		
		System.out.println(name.toUpperCase()); //retorna la misma cadena en mayusculas
		
		System.out.println(name.toLowerCase()); //retorna la misma cadena en minusculas
		
		System.out.println(name.trim()); //retorna la misma cadena pero sin espacios al inicio
		
		System.out.println(name.replace("B", "V")); //retorna la misma cadena pero reemplazando el primer parametro por el segundo, siendo el primer parametro lo que se buscaria dentro de la cadena para ser reemplazado por el segundo
		
	}
}
