package part1;

public class Part16 {
	
	public static void master() {
		
		//wrapper class = proporciona una manera de usar tipos de dato primitivos como tipos de datos referencia, los datos de referencia tienen metodos muy utiles, pueden ser usados con colecciones (como arreglos)
		
		//primitivo    //wrapper
		//---------    //--------
		//boolean      //Boolean
		//char         //Character
		//int          //Integer
		//double       //Double
		
		//autoboxing = la conversion automatica que el compilador de Java hace entre el dato primitivo y su equivalente wrapper
		//unboxing = lo inverso de autoboxing, conversion automatica de un wrapper a primitivo
		
		//autoboxing
		//a continuacion, el hecho de simplemente inicializar variables de esta forma con sus respectivos wrapper class se considera "autoboxing"
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Alejandro";
		
		//unboxing
		//aqui probamos que a pesar de ser tipo wrapper (comportarse como datos de referencia) siguen comportandose como datos de tipo primitivo:
		if(a==true) {
			System.out.println("Esto es verdadero");
		}
		
		//Conclusion: aun se puede considerar un wrapper como un tipo primitivo por su comportamiento, con esto concluimos tambien el por que al declarar string se hace con la inicial mayuscula y no minuscula como los demas
		//Ventajas: acceso a muchos metodos utiles
		//Desvantajas: menos optimizado, mas lento
	}

}
