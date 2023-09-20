import java.util.Scanner;

public class Bee3301 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int vet [] = new int [3], maior = -1, menor = 10, posmai = -1, posme = -1, x = -1;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = s.nextInt();
			if (i == 0) {
				maior = vet[i];
				posmai = i;
			}
			else if (vet[i] > maior) {
				maior = vet[i];
				posmai = i;
			}
			if (i == 0) {
				menor = vet[i];
				posme = i;
			}
			else if (vet[i] < menor) { 
				menor = vet[i];
				posme = i;
			}
		}
		for (int i = 0; i < vet.length; i++) {
			if (i != posme && i != posmai) {
				x = i;
			}
		}
		if (x == 0) System.out.println ("huguinho");
		else if (x == 1) System.out.println ("zezinho");
		else System.out.println ("luisinho");
	}
}
