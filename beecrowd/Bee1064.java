import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1064 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int aux = 0;
		double media = 0;
		double[] a = new double[6];
		for (int i = 0; i <6; i++) {
			a[i] = s.nextDouble();
			if (a[i] >= 0) {
				aux++;
				media = a[i] + media;
		    }
		}
	   media = media /aux;
	   System.out.println (aux + " valores positivos");
	   System.out.println (df.format(media));
	   s.close();
	}
}