package herança3;

public class Papagaio extends Ave{
	private String vocabulario;
	
	public Papagaio (String nome, String vocabulario) {
		super(nome);
		this.vocabulario = "\u001B[33m"+ vocabulario +"\u001B[0m";
	}
	
	public String falar() {
		return vocabulario;
	}
}
