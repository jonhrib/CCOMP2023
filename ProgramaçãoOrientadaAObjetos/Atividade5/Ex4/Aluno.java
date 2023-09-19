package Ex4;

public class Aluno extends Pessoa {
	private int numMatricula;
	private double media;
	private int faltas;
	
	public Aluno(int codigo, String nome, String telefone, String endereço, int numMatricula, double media, int faltas) {
		super (codigo,nome,telefone,endereço);
		this.numMatricula = numMatricula;
		this.media = media;
		this.faltas = faltas;
	}
	
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Matrícula:" + this.getNumMatricula());
		System.out.println("Media: " + this.getMedia());
		System.out.println("Faltas: " + this.getFaltas());
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

}
