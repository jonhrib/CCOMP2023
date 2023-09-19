package herança3;

public class Mamifero extends Animal {
	private int velocidade;
	
	public Mamifero (String nome, int velocidade) {
		super (nome);
		this.classe = "Mamífero";
		this.velocidade = velocidade;
	}
	
	public void correr () {
		for (int i = 0; i < velocidade; i++) {
			if (i < velocidade-1) System.out.print("correndo ");
			else System.out.print("correndo");
		}
		System.out.println();
	}
}
