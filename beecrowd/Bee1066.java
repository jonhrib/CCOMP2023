import java.util.Scanner;

public class Bee1066 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int par = 0;
		int imp = 0;
		int pos = 0;
		int neg = 0;
		double[] a = new double[5];
		for (int i = 0; i <5; i++) {
			a[i] = s.nextDouble();
			if (a[i]%2 == 0) {
				par++;
		    }
			if (a[i]%2 != 0) {
				imp++;
		    }
			if (a[i] > 0) {
				pos++;
		    }
			if (a[i] < 0) {
				neg++;
		    }
		}
	   System.out.println (par + " valor(es) par(es)");
	   System.out.println (imp + " valor(es) impar(es)");
	   System.out.println (pos + " valor(es) positivo(s)");
	   System.out.println (neg + " valor(es) negativo(s)");
	   s.close();
	}
}