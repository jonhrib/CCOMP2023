package Ex1;

public class Aluno {
	protected String codigo;
	protected String nome;
	protected String telefone;
	protected String endereço;
	
	public Aluno(String codigo, String nome, String telefone, String endereço) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}
	
	public void ImprimeDados() {
		System.out.println("--------------------------------------------------");
		System.out.println("Código: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Endereço: " + getEndereço());
		System.out.println("--------------------------------------------------");
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
}
