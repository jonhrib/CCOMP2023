import java.util.Scanner;

public class Bee3209 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int y = s.nextInt(), soma = 0, vet [] = new int [y];
			for (int j = 0; j < y; j++) {
				vet[j] = s.nextInt();
				if (j < y-1) vet[j] = vet [j]-1;
				soma += vet[j];
			}
			System.out.println (soma);
		}
	}
}
