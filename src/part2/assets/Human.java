package part2.assets;

public class Human {
	
	public String nombre;
	public int edad;
	public double peso;
	
	public Human(String nombre, int edad, double peso) {
		
		//this representa el objeto al momento de crearse, imagina que en vez de 'this' dice el nombre de la variable a la que estas inicializando como un objeto
		//this es un placeholder que cambia el resultado obtenido de acuerdo al objeto del momento
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println(this.nombre + " esta comiendo");
	}
	
	public void beber() {
		System.out.println(this.nombre + " esta bebiendo");
	}

}
