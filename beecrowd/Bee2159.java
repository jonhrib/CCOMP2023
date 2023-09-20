import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2159 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		long n = s.nextLong();
		double p = n/(Math.log(n));
		double m = (1.25506 * (p));
		System.out.println (df.format(p) + " " + df.format(m));
	}
}
