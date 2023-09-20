import java.util.Scanner;

public class Bee1961 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int p = s.nextInt();
		int n = s.nextInt();
		int [] c = new int [n];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.nextInt();
		}
		boolean t = true;
		for (int i = 0; i < c.length; i++) {
			if (i >= 1) {
				if (c[i] > (c[i-1]+p)) {
					t = false;
					break;
				}
				else t = true;
			}
		}
		if (t == false) System.out.println ("GAME OVER");
		else System.out.println ("YOU WIN");
		s.close();
	}
}
