import java.util.Scanner;
import java.text.*;

public class Bee2234 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = (a/b);
		System.out.println (df.format(c));
	}
}
