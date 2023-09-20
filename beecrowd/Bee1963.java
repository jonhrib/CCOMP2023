import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1963 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double valor = 0;
		valor = ((b/a)-1)*100;
		System.out.println (df.format(valor) + "%");
		s.close();
	}
}
