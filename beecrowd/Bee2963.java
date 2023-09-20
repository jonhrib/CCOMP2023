import java.util.Scanner;

public class Bee2963 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt(), carlos = 0, cont = 0;
		for (int i = 0; i < x; i++) {
			int nota = s.nextInt();
			if (i == 0) carlos = nota;
			else if (nota > carlos) cont++;
		}
		if (cont > 0) System.out.println ("N");
		else System.out.println ("S");
	}
}
