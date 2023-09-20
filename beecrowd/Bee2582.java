import java.util.Scanner;

public class Bee2582 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int c = s.nextInt();
		for (int i = 0; i < c; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a+b == 0) System.out.println ("PROXYCITY");
			else if (a+b == 1) System.out.println ("P.Y.N.G.");
			else if (a+b == 2) System.out.println ("DNSUEY!");
			else if (a+b == 3) System.out.println ("SERVERS");
			else if (a+b == 4) System.out.println ("HOST!");
			else if (a+b == 5) System.out.println ("CRIPTONIZE");
			else if (a+b == 6) System.out.println ("OFFLINE DAY");
			else if (a+b == 7) System.out.println ("SALT");
			else if (a+b == 8) System.out.println ("ANSWER!");
			else if (a+b == 9) System.out.println ("RAR?");
			else if (a+b == 10) System.out.println ("WIFI ANTENNAS");
		}
	}
}
