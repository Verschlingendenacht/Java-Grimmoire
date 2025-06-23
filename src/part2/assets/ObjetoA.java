package part2.assets;

public class ObjetoA {
	
	private String nombre;
	private int vida;
	private boolean vivo;
	private float ataque;
	
	public ObjetoA(String nombre, int vida, boolean vivo, float ataque) {
		this.nombre = nombre;
		this.vida = vida;
		this.vivo = vivo;
		this.ataque = ataque;
	}
	
	//Para poder sobreescribir el metodo toString() correctamente se debe retornar un String, no se pueden arreglos de String
	public String toString() {
	
		return "nombre: "+this.nombre+"\n"+"vida: "+this.vida+"\n"+"vivo: "+this.vivo+"\n"+"ataque: "+this.ataque;
	}
	
}
