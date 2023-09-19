package Ex4;

public class AlunoMestrado extends Aluno{
	private double conceitoDissertação;
	private double notaDissertação;
	
	public AlunoMestrado(int codigo, String nome, String telefone, String endereço, int numMatricula, double media, int faltas, char conceitoDissertação, double notaDissertação) {
		super(codigo,nome,telefone,endereço,numMatricula,media,faltas);
		this.conceitoDissertação = conceitoDissertação;
		this.notaDissertação = notaDissertação;
	}
	
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Conceito da Dissertação: " + this.getConceitoDissertação());
		System.out.println("Nota da Dissertação: " + this.getNotaDissertação());
	}
	
	public boolean aprovado() {
		int limf = 12; //limite de faltas
		boolean teste = false; boolean conceito = false;
		
		if (this.conceitoDissertação == 'A' || this.conceitoDissertação == 'a') conceito = true;
		else if (this.conceitoDissertação == 'B' || this.conceitoDissertação == 'b') conceito = true;
		else if (this.conceitoDissertação == 'C' || this.conceitoDissertação == 'c') conceito = true;
		
		if (this.notaDissertação >= this.getMedia() && this.getFaltas() <= limf && conceito) teste = true; // para ser aprovado deve estar acima ou na média + dentro do limite de faltas
		else if (this.notaDissertação < this.getMedia() && this.getFaltas() <= limf && conceito) teste = false;
		
		return teste;
	}

	public double getConceitoDissertação() {
		return conceitoDissertação;
	}

	public void setConceitoDissertação(double conceitoDissertação) {
		this.conceitoDissertação = conceitoDissertação;
	}

	public double getNotaDissertação() {
		return notaDissertação;
	}

	public void setNotaDissertação(double notaDissertação) {
		this.notaDissertação = notaDissertação;
	}

}
