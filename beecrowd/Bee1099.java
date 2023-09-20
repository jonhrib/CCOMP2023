import java.util.Scanner;

public class Bee1099 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int soma = 0;
		for (int i = 0; i < x; i++) {
			soma = 0;
			int a = s.nextInt();
			int b = s.nextInt();
			if (a <  b) {
				for (int j = a+1; j < b; j++) {
					if (j%2 != 0) {
						soma = soma + j;
					}
				}
				System.out.println (soma);
			}
			else if (a > b) {
				for (int j = b+1; j < a; j++) {
					if (j%2 != 0) {
						soma = soma + j;
					}
				}			
				System.out.println (soma);
			}
			else if (a == b) {
				soma = 0;
				System.out.println (soma);
			}
		}
	}
}
