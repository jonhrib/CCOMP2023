import java.util.Scanner;

public class Bee1866 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int valor;
		int b = 0;
		for (int i = 0; i < a; i++) {
			b = s.nextInt();
			valor = 0;
			for (int j = 1; j <= b; j++) {
				if (j%2 == 0) {
					valor -= 1;
				}
				if (j%2 != 0) {
					valor += 1;
				}	
			}
			System.out.println (valor);
		}
	}
}
