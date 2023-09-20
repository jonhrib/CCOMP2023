import java.util.Scanner;

public class Bee1113 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		while (x != y) {
			if (x < y) System.out.println ("Crescente");
			else if (x > y) System.out.println ("Decrescente");
			x = s.nextInt ();
			y = s.nextInt();
		}
		s.close();
	}
}
