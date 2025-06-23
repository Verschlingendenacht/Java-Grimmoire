package part1;

public class Part13 {
	public static void master() {
		
		String car[] = {"Camaro","Corvette","Tesla"};
		String[] fruits = {"Mango", "Strawberry"};
		
		car[0] = "GMT BMW";
		
		System.out.println(car[0]);
		System.out.println(fruits);
		
		for(int i = 0; i<car.length;i++) {
			System.out.println(car[i]);
		}
		
	}
	
}
