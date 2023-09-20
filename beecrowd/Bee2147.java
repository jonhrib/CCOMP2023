import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee2147 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			String galopeira = s.next();
			double tam = (galopeira.length()*0.01);
			System.out.println (df.format(tam));
		}
	}
}
