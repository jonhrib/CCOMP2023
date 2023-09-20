import java.util.Scanner;

public class Bee2949 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), h = 0, hu = 0, e = 0, a = 0, m = 0;
		for (int i = 0; i < x; i++) {
			String nome = s.next();
			char tipo = s.next().charAt(0);
			if (tipo == 'A') a++;
			else if (tipo == 'E') e++;
			else if (tipo == 'H') hu++;
			else if (tipo == 'M') m++;
			else if (tipo == 'X') h++;
		}
		System.out.println (h + " Hobbit(s)");
		System.out.println (hu + " Humano(s)");
		System.out.println (e + " Elfo(s)");
		System.out.println (a + " Anao(oes)");
		System.out.println (m + " Mago(s)");
	}
}
