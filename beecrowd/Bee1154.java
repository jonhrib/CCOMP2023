import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1154 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		double x = s.nextDouble();
		int aux = 0;
		double media = 0;
		while (x >= 0) {
			media = media + x;
			aux++;
			x = s.nextDouble();
		}
		media = (media/aux);
		System.out.println (df.format(media));
	}
}
