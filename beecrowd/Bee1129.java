import java.util.Scanner;

public class Bee1129 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt(); int cont = 0, contb = 0;
		
		while (qtd != 0) {
			int vet [] = new int [5];
			for (int i = 0; i < qtd; i++) {
				cont = 0; contb = 0;
				for (int j = 0; j < 5; j++) {
					vet[j] = s.nextInt();
					if (vet[j] <= 127) cont++;
					if (vet[j] > 127) contb++;
				}
				if (cont > 1 || contb == 5) System.out.println ("*");
				else {
					for (int j = 0; j < 5; j++) {
						if (vet[j] <= 127) {
							if (j == 0) System.out.println ("A");
							if (j == 1) System.out.println ("B");
							if (j == 2) System.out.println ("C");
							if (j == 3) System.out.println ("D");
							if (j == 4) System.out.println ("E");
						}
					}
				}
			}
			qtd = s.nextInt();
		}
	}
}
