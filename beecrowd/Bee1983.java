import java.util.*;

public class Bee1983 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int [] b = new int [x];
		double [] a = new double [x];
	    double maior = 0;
		int posmaior = 0;
		for (int i = 0; i < x; i++) {
			b[i] = s.nextInt();
			a[i] = s.nextDouble();
			if (i == 0) {
				maior = a[i];
				posmaior = b[i];
			}
			else if (a[i] > maior) {
				maior = a[i];
				posmaior = b[i];
			}
		}
		if (maior >= 8.0) System.out.println (posmaior);
		else System.out.println ("Minimum note not reached");
		s.close();
	}
}
