import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1117 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double x = s.nextDouble();
		while (x < 0 || x > 10) {
			System.out.println ("nota invalida");
			x = s.nextDouble();
		}
		double y = s.nextDouble();
		while (y < 0 || y > 10) {
			System.out.println ("nota invalida");
			y = s.nextDouble();
		}
		double media = ((x + y)/2);
		System.out.printf ("media = " + df.format(media));
	}
}
