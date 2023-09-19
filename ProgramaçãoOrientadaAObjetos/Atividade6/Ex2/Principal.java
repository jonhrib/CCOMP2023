package Ex2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main (String args []) {
		Scanner s = new Scanner(System.in);
		
		LatinhaCerveja l1 = new LatinhaCerveja(001,"Skol",250.23,"15/06/2023","28/11/2023");
		LatinhaCerveja l2 = new LatinhaCerveja(002,"Brahma",300.00,"14/07/2023","30/12/2023");
		LatinhaCerveja l3 = new LatinhaCerveja(003,"Corona",450.21,"10/09/2023","05/02/2024");
		LatinhaCerveja l4 = new LatinhaCerveja(004,"Heineken",375.75,"08/09/2023","07/02/2024");
		LatinhaCerveja l5 = new LatinhaCerveja(005,"Patagônia",150.03,"02/05/2020","05/07/2021");
		
		Map <String,LatinhaCerveja> latinhas = new HashMap<>();
		
		latinhas.put("Jorginho", l3);
		latinhas.put("Robson Almeida", l1);
		latinhas.put("Wilson", l2);
		latinhas.put("Vinicius", l4);
		latinhas.put("Kelly", l5);
		
		System.out.println("Digite o apelido da latinha que deseja conferir as informações: ");
		String teste = s.nextLine();
		//latinhas.get(teste).Imprime();
		
		int cont = 0;
		for (String chave: latinhas.keySet()) {
			if (chave.equals(teste)) { 
				latinhas.get(teste).Imprime();
				break;
			}
			else if (cont == latinhas.size()-1) System.out.println("O apelido não existe.");
			cont++;
		}
	}
}
