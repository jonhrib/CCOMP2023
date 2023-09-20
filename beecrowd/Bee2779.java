import java.util.Scanner;

public class Bee2779 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int qtd = s.nextInt();
		int vet [] = new int [qtd]; 
		for (int i = 0; i < qtd; i++) {
			vet [i] = s.nextInt();
		}
		int rep = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (vet[i] == vet[j]) {
					rep++;
					if (rep > 1) {
						vet[j] = 0;
					}
				}
			}
			rep = 0;
		}
		int cont = 0;
		for (int i = 0; i < qtd; i++) {
			if (vet[i] != 0) {
				cont++;
			}
		}
		int result = x-cont;
		System.out.println (result);
	}
}
