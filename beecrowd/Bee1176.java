import java.util.Scanner;

public class Bee1176 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		for (int j = 0; j < a; j++) {
			int x = s.nextInt();
			long anterior = 0, atual = 1, proximo;
			for (int i = 0; i < x; i++) {
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}
			System.out.println ("Fib(" + x + ") = " + anterior);		}
	}
}
