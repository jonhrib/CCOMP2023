import java.util.Scanner;

public class Bee2715 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			int x = s.nextInt();
			int vet [] = new int [x];
			for (int i = 0; i < x; i++) {
				vet [i] = s.nextInt();
			}
			int soma = 0, result = 0;
			for (int i = 0; i < x; i++) {
				soma += vet [i];
			}
			double aux = soma/2.0;// determina a metade da soma total dos níveis de dificuldade
			int somaaux = 0;
			int i = 0;
			while (somaaux < aux) {
				somaaux += vet[i];
				if (somaaux > aux) {
					somaaux -= vet[i];
					break;
				}
				i++;
			}
			int soma1 = 0, soma2 = 0;
			for (i = 0; i < x; i++) {
				soma1 += vet [i];
				if (soma1 == somaaux) {
					while (i < x-1) {
						i++;
						soma2 += vet[i];
					}
				}
			}
			result = soma2-somaaux;
			System.out.println (result);
		}
	}
}