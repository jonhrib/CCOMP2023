import java.util.Scanner;

public class Bee1177 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] a = new int [1000];
		int aux = 0;
		while (aux < 999) {
			for (int j = 0; j < n;j++) {
				if (aux > 999) break;
				a[aux] = j;
				aux++;
			}
		}
		for (int j = 0; j < a.length;j++) {
			System.out.println ("N[" + j + "] = " + a[j]);
		}
	}
}
