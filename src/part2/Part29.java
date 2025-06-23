package part2;

import part2.assets.Comida;

public class Part29 {
	static void master() {
		
		//FORMA 1
	
		Comida[] refrigerador = new Comida[3];
		
		Comida comida1 = new Comida("Pizza");
		Comida comida2 = new Comida("Hamburgesa");
		Comida comida3 = new Comida("Perro");
		
		refrigerador[0] = comida1;
		refrigerador[1] = comida2;
		refrigerador[2] = comida3;
		
		for(Comida i : refrigerador) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//FORMA 2
		Comida[] refrigerador2 = {comida1, comida2, comida3};
		
		for(Comida i : refrigerador2) {
			System.out.println(i);
		}
	}
}
