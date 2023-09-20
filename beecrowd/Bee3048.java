import java.util.Scanner;

public class Bee3048 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int vet [] = new int [qtd];
		
		for (int i = 0; i < qtd; i++) {
			vet[i] = s.nextInt();
		}
		int aux = 0;
		for (int i = 0; i < qtd; i++) {
			if (i == 0) aux++;
			if (i > 0) {
				if (vet[i] != vet[i-1]) aux++;
			}
		}
		System.out.println (aux);
	}
}
