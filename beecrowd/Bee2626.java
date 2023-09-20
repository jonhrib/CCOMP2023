import java.util.Scanner;

public class Bee2626 {

	private static final String PEDRA = "pedra";
	private static final String PAPEL = "papel";
	private static final String TESOU = "tesoura";
	
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String dodo = leitor.next().toLowerCase().trim();
			String leo = leitor.next().toLowerCase().trim();
			String pepper = leitor.next().toLowerCase().trim();
			if (isDraw(dodo, leo, pepper)) 
				System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
			else if (isWinner(dodo, leo, pepper)) 
				System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
			else if (isWinner(leo, dodo, pepper))
				System.out.println("Iron Maiden's gonna get you, no matter how far!");
			else if (isWinner(pepper, leo, dodo))
				System.out.println("Urano perdeu algo muito precioso...");
			else
				throw new NullPointerException("invalid game");
		}
	}
	
	private static boolean isDraw(String a, String b, String c) {
		
		// Caso todos joguem a mesma coisa da empate
		if (a.equals(PEDRA) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		if (a.equals(PAPEL) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		if (a.equals(TESOU) && b.equals(TESOU) && c.equals(TESOU)) return true;
		
		// Caso todos joguem diferente da empate
		if (a.equals(PEDRA) && b.equals(PAPEL) && c.equals(TESOU)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(PAPEL)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(TESOU) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PEDRA) && c.equals(PAPEL)) return true;
		
		// Caso haja duas tesouras e um papel da empate
		if (a.equals(TESOU) && b.equals(TESOU) && c.equals(PAPEL)) return true;
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(TESOU) && c.equals(TESOU)) return true;
		
		// Caso haja dois papeis e uma pedra da empate
		if (a.equals(PAPEL) && b.equals(PAPEL) && c.equals(PEDRA)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(PAPEL)) return true;
		if (a.equals(PEDRA) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		
		// Caso haja duas pedras e uma tesoura da empate
		if (a.equals(PEDRA) && b.equals(PEDRA) && c.equals(TESOU)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		
		// Caso contrario retorna false pois não foi empate
		return false;
	}
	
	private static boolean isWinner(String a, String b, String c) {
		
		// Caso uma dessas verificações fique satisfeita então se retorna sim
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		
		// Caso contrario não
		return false;
	}
	
}