package part1;

public class Part3 {
	public static void master() {
		
		int manzanas = 10;
		
		System.out.println(manzanas+1);
		System.out.println(manzanas-1);
		System.out.println(manzanas*2);
		System.out.println(manzanas/2);
		System.out.println(manzanas%2);
		//ver Math class para saber como elevar a la potencia
		
		//casting
		
		System.out.println(manzanas/3);
		//solucion:
		double casteo = (double) manzanas / 3;
		System.out.println(casteo);
	};
}
