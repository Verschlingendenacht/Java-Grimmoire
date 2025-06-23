package part1;

import java.util.ArrayList;

public class Part19 {
	public static void master() {
		
		//for-each hace alegoria al for i in x de python, requiere menos pasos que un for convencional pero es menos flexible
		
		String[] animales = {"Zorro", "Vaca", "Gato"};
		
		//Tradicionalmente:
		for(int i = 0; i < animales.length;i++) {
			System.out.println(animales[i]);
		}
		
		//For-Each
		for(String i : animales) {
			System.out.println(i);
		}
		
		//Ahora probemos lo mismo con un ArrayList
		ArrayList<String> espadas = new ArrayList<String>();
		
		espadas.add("Messer");
		espadas.add("Claymore");
		espadas.add("Zweihänder");
		
		//Tradicionalmente
		for(int i = 0; i < espadas.size();i++) {
			System.out.println(espadas.get(i));
		}
		
		//For-Each
		for(String i : espadas) {
			System.out.println(i);
		}
		
	}
}
