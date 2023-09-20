import java.util.Scanner;

public class Bee1165 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int a = s.nextInt();
			int cont = 0;
			for (int j = 1; j <= a; j++) {
				if (a%j == 0) {
					cont++;
				}
			}
			if (cont > 2) {
				System.out.println (a + " nao eh primo");
			}
			else System.out.println (a + " eh primo");
		}
		s.close();
	}
}
