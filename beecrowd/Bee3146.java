import java.util.Scanner;
import java.text.*;

public class Bee3146 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double x = s.nextDouble();
		System.out.println (df.format(2*3.14*x));
	}
}
