import java.util.Scanner;

public class Bee1060 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int aux = 0;
		double a [] = new double[6];
		for (int i = 0; i <6; i++) {
			a[i] = s.nextDouble();
			if (a[i] >= 0) {
				aux++;
		    }
		}
	   System.out.println (aux + " valores positivos");
	   s.close();
	}
}
