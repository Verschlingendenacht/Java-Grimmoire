package part2.assets;

public class Garaje {
	
	private Carro[] espacios = new Carro[20];
	
	public void parquear(Carro carro) {
		for(int i = 0; i < espacios.length; i++) {
			if(espacios[i]==null) {
				espacios[i] = carro;
				break;
			}
		}
	}
	
	public String toString() {
		int ocupados = 0;
		String resultado = "Espacios en uso: \n\n";
		for(int i = 0; i < this.espacios.length; i++) {
			if(this.espacios[i]!=null) {
				ocupados += 1;
				resultado += (i+1)+"-"+espacios[i]+"\n";
			}
		}
		return resultado+"\n"+"Espacio disponible: "+ocupados+"/"+espacios.length;
	}
	
	
}
