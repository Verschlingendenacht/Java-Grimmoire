package part1;

public class Part14 {
	public static void master() {
		
		//Arreglo Multidimensional = Arreglo de arreglos
		
		String[][] cars = new String[3][3]; //Se declara una variable que almacenara dos arreglos en un determinado espacio como asignacion, inicializando asi un arreglo de 2 dimensiones
		//Primer arreglo = fila
		//Segundo arreglo = Columna
		//Como leer dimensiones de un arreglo: cada elemento del corchete de la izquierda contiene a todos los elementos del corchete de la derecha
		
		//Asignamos valores al arreglo bidimensional manualmente
		
		//Inicializacion alternativa de un arreglo bidimensional:
		String[][] fruits = {{"Mango","Pera","Manzana"},{"Aguacate", "Banano","Platano"},{"Sandia", "Papaya", "Uvas"}};
		System.out.println(fruits); //A diferencia de python, aca no imprime los elementos del arreglo pero si su posicion de memoria
		
		cars[0][0] = "Corvette";
		cars[0][1] = "Mustang";
		cars[0][2] = "Brabus";
		cars[1][0] = "Italo";
		cars[1][1] = "M3";
		cars[1][2] = "BMW";
		cars[2][0] = "GT Raptor";
		cars[2][1] = "EX-Mantra";
		cars[2][2] = "Bungie";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) { //Recuerda, cada elemento i es un arreglo en si mismo
				System.out.print(cars[i][j]+" ");
				
			}
		}
		
		
	}
}
