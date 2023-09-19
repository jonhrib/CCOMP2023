package Ex2;

public class LatinhaCerveja {
	protected int id;
	protected String marca;
	protected double conteudo;
	protected String fabricação;
	protected String validade;
	
	public LatinhaCerveja (int id, String marca, double conteudo, String fabricação, String validade) {
		this.id = id;
		this.marca = marca;
		this.conteudo = conteudo;
		this.fabricação = fabricação;
		this.validade = validade;
	}
	public void Imprime() {
		System.out.println("=================== LATINHA ===================");
		System.out.println("Id: " + getId());
		System.out.println("Marca: " + getMarca());
		System.out.println("Conteúdo (em ml): " + getConteudo());
		System.out.println("Fabricação: " + getFabricação());
		System.out.println("Validade: " + getValidade());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	public String getFabricação() {
		return fabricação;
	}
	public void setFabricação(String fabricação) {
		this.fabricação = fabricação;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}
