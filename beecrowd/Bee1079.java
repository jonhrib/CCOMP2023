import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1079 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int x = s.nextInt();
		double media = 0;
		for (int i = 0; i < x; i++) {
	    	double a = s.nextDouble();
	    	double b = s.nextDouble();
	    	double c = s.nextDouble();
	    	media = (((a*2) + (b*3) + (c*5)) / 10);
			System.out.println (df.format(media));
		}
	}
}
