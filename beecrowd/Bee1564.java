import java.util.Scanner;

public class Bee1564 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int valor;
		while (s.hasNext()) {
			valor = s.nextInt();
			if (valor == 0) {
				System.out.println ("vai ter copa!");
			}
			else if (valor > 0) {
				System.out.println ("vai ter duas!");
			}
		}
		s.close();
	}
}
