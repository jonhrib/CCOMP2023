import java.util.Scanner;

public class Bee2520 {
 
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();
			int distancia = 0;
			int treinadorX = 0;
			int treinadorY = 0;
			int pokemonX = 0;
			int pokemonY = 0;
			for (int x = 0; x < N; x++) {
				for (int y = 0; y < M; y++) {
					int P = leitor.nextInt();
					if (P == 1) {
						treinadorX = x;
						treinadorY = y;
					}
					if (P == 2) {
						pokemonX = x;
						pokemonY = y;
					}
				}
			}
			
			if (treinadorX > pokemonX) distancia += (treinadorX - pokemonX);
			else if (pokemonX > treinadorX) distancia += (pokemonX - treinadorX);
			
			if (treinadorY > pokemonY) distancia += (treinadorY - pokemonY);
			else if (pokemonY > treinadorY) distancia += (pokemonY - treinadorY);
			
			System.out.println(distancia);
		}
	}
	
}