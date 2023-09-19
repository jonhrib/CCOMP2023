package Ex3;

public class Panquecas extends Receita implements Cozido {
	private String Ingredientes;
	private String ModoDeFazer;
	
	public Panquecas() {
		super("Doce");
		Ingredientes = "1 Ovo, 1xic Farinha de Trigo, 2col Açúcar, 1col Fermento em Pó, 1/8col Sal, 3/4xic Leite e 2col Manteiga.";
		ModoDeFazer = "Em um recipiente bata o ovo até quese forma uma espuma, após, misture todos os outros ingredientes, exceto a Manteiga e misture até que a massa fique homogênea.\n Em uma panela, coloque pequenas porções de massa (1/4 xícara) para cozinhar. ";
		
		this.Ingredientes = "Ingredientes: "  + Ingredientes;
		this.ModoDeFazer = "Modo de Preparo: " + ModoDeFazer;
		
	}

	@Override
	public String getIngredientes() {
		return this.Ingredientes;
	}

	@Override
	public String getModoDeFazer() {
		return this.ModoDeFazer;
	}

	@Override
	public void cozinhar() {
		System.out.println ("ATENÇÃO: As panquecas devem ser cozidas (fritas) em uma frigideira por aproximadamente 2 minutos, ou até estarem douradas.");
	}
}
