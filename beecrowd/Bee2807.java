import java.util.Scanner;

public class Bee2807 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt(), vet [] = new int [qtd];
		for (int i = 0; i < qtd; i++) {
			if (i == 0) vet[i] = 1;
			else if (i == 1) vet [i] = 1;
			else if (i > 1) vet [i] = vet[i-2] + vet [i-1];
		}
		int vetaux [] = new int [qtd];
		for (int i = 0; i < qtd; i++) {
			vetaux [qtd-i-1] = vet [i];
		}
		
		for (int i = 0; i < qtd; i++) {
			if (i < qtd -1) System.out.print (vetaux[i] + " ");
			else System.out.println (vetaux[i]);
		}
	}
}
