package part2.assets;

import java.util.Random;

public class TirarDado {
	
	/*
	 * --CON VARIABLES LOCALES--
	 * 
	public TirarDado() {
		Random random = new Random();
		int numero = 0;
		tirar(random, numero);
	}
	
	public void tirar(Random random, int numero) {
		numero = random.nextInt(6)+1;
		System.out.println(numero);
	}
	*/
	
	//--CON VARIABLES GLOBALES--
	Random random = new Random();
	private int numero;
	
	public TirarDado() {
		this.numero = random.nextInt(6)+1;
		tirar();
	}
	
	private void tirar() {
		System.out.println(numero);
	}
}
