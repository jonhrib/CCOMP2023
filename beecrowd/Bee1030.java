import java.util.Scanner;

public class Bee1030 {
	
	 public static int josephus(int n, int k) {
	        if (n == 1)
	            return 1;
	        else
	            return (josephus(n - 1, k) + k - 1) % n + 1;
	    }

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int nc = s.nextInt();
		for (int i = 0; i < nc; i++) {
			int n = s.nextInt();
			int k = s.nextInt();
			int valor = josephus(n,k);
			System.out.println("Case " + (i+1) + ": " + valor);
		}
	}
}
