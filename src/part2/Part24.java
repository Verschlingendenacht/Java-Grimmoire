package part2;

import part2.assets.Car;

public class Part24 {
	
	static void master() {
		Car car1 = new Car();
		
		car1.conducir();
		car1.frenar();
		
		System.out.println(car1.diseñador);
		System.out.println(car1.modelo);
		System.out.println(car1.año);
		System.out.println(car1.color);
		System.out.println(car1.precio);
		
		Car car2 = new Car();
		
		System.out.println(car2.diseñador);
		car2.conducir();
		car2.frenar();
	}
}
