package part2;

import part2.assets.Carro;
import part2.assets.Garaje;

public class Part30 {
	
	static void master() {
		
		Garaje garaje = new Garaje();
		Carro carro1 = new Carro("Mazda");
		Carro carro2 = new Carro("BMW");
		Carro carro3 = new Carro("GT3");
		
		garaje.parquear(carro1);
		garaje.parquear(carro2);
		garaje.parquear(carro3);
		
		System.out.println(garaje);
		
		
	}
}
