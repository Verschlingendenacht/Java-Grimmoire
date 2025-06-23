package part2.assets;

public class Pizza {
	
	private String pan;
	private String salsa;
	private String queso;
	private String cobertura;
	
	public Pizza(String pan, String salsa, String queso, String cobertura) {
		this.pan = pan;
		this.salsa = salsa;
		this.queso = queso;
		this.cobertura = cobertura;
	}
	
	public Pizza(String pan, String salsa, String queso) {
		this.pan = pan;
		this.salsa = salsa;
		this.queso = queso;
	}
	
	public Pizza(String pan, String salsa) {
		this.pan = pan;
		this.salsa = salsa;
	}
	
	public Pizza(String pan) {
		this.pan = pan;
	}
	
	public void mostrarAtributos() {
		System.out.println(this.pan + "\n" + this.salsa + "\n" + this.queso + "\n" + this.cobertura);
	}
}
