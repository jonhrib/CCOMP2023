package PacotePrincipal;

public class Estagios { //classe do objeto Estagios, permite associar em um mesmo Objeto, nome e tempo
	
	private String nome;// atributo nome 
	private int tempo; // atributo tempo
	
	public Estagios (String nome, int tempo) { //construtor que recebe nome e tempo de parâmetros
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() { // get para nome
		return nome;
	}

	public void setNome(String nome) { // set para nome
		this.nome = nome;
	}

	public int getTempo() { // get para tempo
		return tempo;
	}

	public void setTempo(int tempo) { // set para tempo
		this.tempo = tempo;
	}
}
