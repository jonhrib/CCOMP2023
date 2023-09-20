import java.util.Scanner;

public class Bee1180 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] a = new int [n];
		int menor = 0;
		int posmenor = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			if (i == 0) {
				menor = a[0];
				posmenor = i;
			}
			else if (a[i] < menor) {
				menor = a[i];
				posmenor = i;
			}
		}
		System.out.println ("Menor valor: " + menor);
		System.out.println ("Posicao: " + posmenor);
	}
}
