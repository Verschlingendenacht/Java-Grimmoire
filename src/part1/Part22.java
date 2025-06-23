package part1;

public class Part22 {

	static void master() {
		
		//piensa en esto como los string templates en python
		
		//printf() no es mas que un metodo de salida a terminal opcional que permite controlar, formatear y mostrar
		//2 argumentos = 1- cadena a formatear, 2- valor a ingresar dentro de la cadena
		//dentro de la cadena podremos ubicar un simbolo % en el cual se mostrara el segundo argumento
		//este porcentaje es un pedazo de codigo que tiene la siguiente estrucura: % [bandera] [precision] [espacios] [caracter de conversion]
		
		
		
		
		//--------------------------------------------
		//CARACTER DE CONVERSION
		//--------------------------------------------
		
		//seguido de este porcentaje debemos especificar el tipo de dato al que corresponde el segundo argumento
		
		int a = 500;
		
		System.out.printf("Hola: %% %d", a);
		System.out.println();
		
		//Solo podemos usar los siguientes despues de %
		//%s: String
		//%d: Decimal integer
		//%f: Floating-point number
		//%b: Boolean
		//%c: Character
		//%o: Octal integer
		//%x, %X: Hexadecimal integer
		//%e, %E: Scientific notation
		//%%: Literal % (para cuando necesitemos expresar porcentajes
		
		//--------------------------------------------
		//ESPACIOS
		//--------------------------------------------
		
		//Si inlcuimos un numero entre el porcentaje y el codigo del dato incluiremos espacios antes o despues del valor agregado dependiendo de si es positivo o negativo, el numero de espacios resultantes es calculado como numeroEspacios-cantidadDigitos
		//positivo -> antes del valor
		//negativo -> despues del valor
		
		System.out.printf("Hola: %10d", a);
		System.out.println();
		System.out.printf("Hola: %-10d", a);
		System.out.println();
		
		//--------------------------------------------
		//PRECISION
		//--------------------------------------------
		
		//Permite redondear el numero de decimales a mostrar de un float o double
		System.out.printf("Hola: %10.2f", 3.1459); //se agregan 10 espacios antes del valor y se redondea el valor a 2 decimales, asi mismo, se especifica que el valor es un flotante
		System.out.println();
		
		//--------------------------------------------
		//BANDERA
		//--------------------------------------------
		
		//La bandera añade un efecto a la salida
		// - : justificacion izquierda
		// + : agrega un signo + o - a un valor numerico
		// 0 : reemplaza los espacios sobrantes con 0
		// , : añade separador de melesimas
		
		System.out.printf("Hola: %+f", 3.14596);
		System.out.println();
		System.out.printf("Hola: %+010.3f", 3.14596);
		System.out.println();
		System.out.printf("Hola: %,10d", 5050050);
		
	}
}
