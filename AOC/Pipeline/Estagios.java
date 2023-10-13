package PacotePrincipal;

public class Estagios {
	
	private String nome;
	private int tempo;
	
	public Estagios (String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
