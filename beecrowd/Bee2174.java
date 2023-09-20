import java.util.Scanner;

public class Bee2174 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		int qtd = s.nextInt();
		String pokemons [] =  new String [qtd];
		int soma = 151;
		for (int i = 0; i < pokemons.length; i++) {
			pokemons[i] = s.next();
			if (i == 0) {
				soma--;
			}
			else {
				int cont = 0;
				for (int j = 0; j < pokemons.length; j++) {
					if (pokemons[i].equals(pokemons[j])) {
						cont++;
					}
				}
				if (cont <= 1) {
					soma--;
				}
			}
		}
		System.out.println ("Falta(m) " + soma + " pomekon(s).");
	}
}
