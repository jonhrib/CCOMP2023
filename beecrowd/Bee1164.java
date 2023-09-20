import java.util.Scanner;

public class Bee1164 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int soma = 0;
		int aux = 0;
		for (int i = 0; i < x; i++) {
			soma = 0;
			int a = s.nextInt();
			for (int j = 1; j < a; j++) {
				if (a%j == 0) {
					soma += j;
				}
			}
			if (soma == a) {
				System.out.println (a + " eh perfeito");
			}
			else System.out.println (a + " nao eh perfeito");
		}
		s.close();
	}
}
