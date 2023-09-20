import java.util.Scanner;

public class Bee1115 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) System.out.println ("primeiro");
			if (x < 0 && y > 0) System.out.println ("segundo");
			if (x < 0 && y < 0) System.out.println ("terceiro");
			if (x > 0 && y < 0) System.out.println ("quarto");
			x = s.nextInt();
			y = s.nextInt();
		}
		s.close();
	}
}
