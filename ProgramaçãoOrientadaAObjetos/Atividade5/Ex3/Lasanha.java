package Ex3;

public class Lasanha extends Receita implements Assado{
	private String Ingredientes;
	private String ModoDeFazer;
	
	public Lasanha() {
		super("Salgado");
		Ingredientes = "500g Massa para Lasanha, 350g Linguiça Toscana, 400g Carne Moída, 400g Queijo Muçarela, 2 Tomates, 300g Passata de Tomate, 4col Azeite, 1/2col Açúcar, 1xic Água, Sal a gosto, Pimenta a gosto, Cheiro Verde a gosto, Orégano a gosto e Manjericão a gosto.";
		ModoDeFazer = "Em uma panela comece refogando a Linguiça e a Carne Moída em fios de Azeite.\nApós, entre com o tomate e deixe refogar até que o último comece a se desmanchar. Adicione o restante dos ingredientes, exceto o Queijo Muçarela.\nPara a montagem: Coloque, em uma refratária que comporte boas porções de recheio, camadas alternadas de massa, molho e queijo, até que todo o recipiente seja preenchido.";
		
		this.Ingredientes = "Ingredientes: "  + Ingredientes;
		this.ModoDeFazer = "Modo de Preparo: " + ModoDeFazer;

	}

	@Override
	public void assar() {
		System.out.println ("ATENÇÃO: A Lasanha deve ser levada a um forno pré-aquecido à 200°C por pelo menos 25 minutos.");
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
