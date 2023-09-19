package herança3;

public class Ave extends Animal {
	
	public Ave(String nome) {
		super(nome);
		this.classe = "Ave";
	}
	
	public String falar() {
		return "\u001B[33mpiu, piu\u001B[0m";
	}
	
	public void voar (int qtd) {
		for (int i = 0; i < qtd; i++) {
			if (i < qtd-1)System.out.print("voando ");
			else System.out.print("voando");
		}
		System.out.println();
	}

}
