import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1189 {

	public static void main (String args []) {
		Scanner s  = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		double soma = 0;
		char t = s.next().toUpperCase().charAt(0);
		double [][] m = new double [12][12];
		for (int i  = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = s.nextDouble();
			}
		}
		for (int i  = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j < i && j < m.length-i-1) soma += m[i][j];
			}
		}
		if (t == 'M') soma /= 30;
		System.out.println (df.format(soma));
	}
}