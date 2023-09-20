import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1182 {

	public static void main (String args []) {
		Scanner s  = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int x = s.nextInt();
		double soma = 0, media = 0;
		char t = s.next().toUpperCase().charAt(0);
		double [][] m = new double [12][12];
		for (int i  = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = s.nextDouble();
			}
		}
		for (int i = 0; i < m.length; i++) {
			soma = soma + m[i][x];
		}
		if (t == 'M') soma = soma / m.length;
		System.out.println (df.format(soma));
	}
}