package Ex3;

public class CarneDePanela extends Receita implements Cozido {
	private String Ingredientes;
	private String ModoDeFazer;
	
	public CarneDePanela () {
		super("Salgado");
		Ingredientes = "500g Carne de Panela, 2 Tomates, 1/3 Alho Poró, 120g Extrato de Tomate, 400ml Água, Sal a gosto, Pimenta a gosto, Açafrão a gosto e 60ml Shoyu.";
		ModoDeFazer = "A carne deve ser selada em uma panela, em seguida, os demais ingredientes devem ser adicionados a ela, acrescenta-se água e coloca-se na pressão.";
		
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
		System.out.println ("ATENÇÃO: A carne deve ser cozida por aproximadamente 30 minutos após a pressão.");
	}

}
