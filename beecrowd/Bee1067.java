import java.util.Scanner;

public class Bee1067 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i %2 != 0) {
				System.out.println (i);
		    }
		}
	   s.close();
	}
}