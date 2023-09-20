import java.util.Scanner;

public class Bee1074 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int[] a = new int [x];
		for (int i = 0; i < x; i++) {
			a[i] = s.nextInt();
			if (a[i]%2 == 0 && a[i] > 0) System.out.println ("EVEN POSITIVE");
			else if (a[i]%2 == 0 && a[i] < 0) System.out.println ("EVEN NEGATIVE");
			else if (a[i]%2 != 0 && a[i] > 0) System.out.println ("ODD POSITIVE");
			else if (a[i]%2 != 0 && a[i] < 0) System.out.println ("ODD NEGATIVE");
			else if (a[i] == 0) System.out.println ("NULL");
		}
		s.close();
	}
}
