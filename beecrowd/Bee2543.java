import java.util.Scanner;

public class Bee2543 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		while (s.hasNext()) {
			int qtd = s.nextInt(); int cont = 0;
			int identificador = s.nextInt();
			for (int i = 0; i < qtd; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				if (x == identificador && y == 0) cont++;
			}
			System.out.println (cont);
		}
	}
}
