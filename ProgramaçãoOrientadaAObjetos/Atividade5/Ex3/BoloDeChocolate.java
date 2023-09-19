package Ex3;

public class BoloDeChocolate extends Receita implements Assado {
	private String Ingredientes;
	private String ModoDeFazer;
	
	public BoloDeChocolate() {
		super("Doce");
		Ingredientes = "3xic Farinha de Trigo, 4col Chocolate em Pó, 2xic Açúcar, 2col Manteiga, 1xic Leite, 4 Ovos e 2col Fermento em Pó.";
		ModoDeFazer = "Em um recipiente fundo o bastante, misture todos os ingredientes até a mistura se tornar homogêna.";
		
		this.Ingredientes = "Ingredientes: "  + Ingredientes;
		this.ModoDeFazer = "Modo de Preparo: " + ModoDeFazer;

	}

	@Override
	public void assar() {
		System.out.println ("ATENÇÃO: O bolo deve ser assado em um forno pré-aquecido à 180°C por cerca de 40 minutos.");
	}

	@Override
	public String getIngredientes() {
		return this.Ingredientes;
	}

	@Override
	public String getModoDeFazer() {
		return this.ModoDeFazer;
	}

}
