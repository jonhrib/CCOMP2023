package herança3;

public class Animal {
	protected String nome;
	protected String classe;
	
	public Animal (String nome) {
		this. nome = nome;
		this.classe = "\u001B[47m\u001B[30mAnimal\u001B[0m";
	}
	
	public void imprime() {
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println("Nome do animal: " + this.nome + " | Classe a qual pertence: " + this.classe);
	}
	
	public String falar() {
		return "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
}
