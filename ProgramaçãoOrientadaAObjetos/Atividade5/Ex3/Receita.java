package Ex3;

public abstract class Receita {
	protected String tipoReceita; //indica se a receita é doce ou salgada
	
	public Receita(String tipoReceita) {
		super();
		this.tipoReceita = tipoReceita;
	}
	
	public abstract String getIngredientes();
	
	public abstract String getModoDeFazer();

	public String getTipoReceita() {
		return "Tipo de Receita: " + tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}
}
