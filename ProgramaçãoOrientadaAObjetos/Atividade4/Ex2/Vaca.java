package herança3;

public class Vaca extends Mamifero {
	private boolean permitirOrdenha;
	
	public Vaca (String nome, int velocidade, boolean permitirOrdenha) {
		super(nome,velocidade);
		this.permitirOrdenha = permitirOrdenha;
	}
	
	public String falar() {
		return "\u001B[92mMuuuu\u001B[0m";
	}
	
	public String ordenhar() {
		if (permitirOrdenha == true) return "está ordenhando";
		else return "não permite ordenha";
	}

}
