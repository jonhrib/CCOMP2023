package herança3;

public class Cachorro extends Mamifero {
	private boolean tipoLatido;
	
	public Cachorro (String nome, int velocidade, boolean tipoLatido) {
		super (nome,velocidade);
		this.tipoLatido = tipoLatido;
	}
	
	public String falar() {
		if (tipoLatido == true) return "\u001B[92mAU, AU\u001B[0m";
		else return "\u001B[92mau, au\u001B[0m";
	}
}
