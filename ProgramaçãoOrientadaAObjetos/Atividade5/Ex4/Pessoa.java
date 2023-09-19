package Ex4;

public abstract class Pessoa {
	private int codigo;
	protected String nome;
	private String telefone;
	protected String endereço;
	
	public Pessoa(int codigo, String nome, String telefone, String endereço) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}
	
	public void imprimeDados() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Endereço: " + this.getEndereço());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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
