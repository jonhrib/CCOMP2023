import java.util.Scanner;

public class Bee1065 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int aux = 0;
		double[] a = new double[5];
		for (int i = 0; i <5; i++) {
			a[i] = s.nextDouble();
			if (a[i]%2 == 0) {
				aux++;
		    }
		}
	   System.out.println (aux + " valores pares");
	   s.close();
	}
}