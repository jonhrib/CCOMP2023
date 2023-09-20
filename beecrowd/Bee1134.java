import java.util.Scanner;

public class Bee1134 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;
		while (x != 4) {
			if (x == 1) {
				a++;
				x = s.nextInt();
			}
			else if (x == 2) {
				g++;
				x = s.nextInt();
			}
			else if (x == 3) {
				d++;
				x = s.nextInt();
			}
			else if (x > 4 || x < 1) {
				x = s.nextInt();
			}
		}
		System.out.println ("MUITO OBRIGADO");
		System.out.println ("Alcool: " + a);
		System.out.println ("Gasolina: " + g);
		System.out.println ("Diesel: " + d);
	}
}
