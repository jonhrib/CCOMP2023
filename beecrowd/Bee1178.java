import java.util.Scanner;

public class Bee1178 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		double[] b = new double [100];
		b[0] = a;
		for (int i = 1; i < b.length;i++) {
				b[i] = (b[i-1]/2.0000);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.printf("N[" + i + "] = %.4f\n" + b[i]);
		}
	}
}
