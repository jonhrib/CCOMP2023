import java.util.Scanner;

public class Bee1759 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		for (int  i = 1; i <= x; i++) {
			System.out.print ("Ho");
			if (i != x) {
				System.out.print (" ");
			}
			if (i == x) {
				System.out.println ("!");
			}
		}
		s.close();
	}
}
