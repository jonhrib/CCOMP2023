import java.util.Scanner;

public class Bee1943 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int k = s.nextInt();
		if (k == 1) System.out.println ("Top 1");
		else if (k > 1 && k <= 3) System.out.println ("Top 3");
		else if (k > 3 && k <= 5) System.out.println ("Top 5");
		else if (k > 5 && k <= 10) System.out.println ("Top 10");
		else if (k > 10 && k <= 25) System.out.println ("Top 25");
		else if (k > 25 && k <= 50) System.out.println ("Top 50");
		else if (k > 50 && k <= 100) System.out.println ("Top 100");
	}
}
